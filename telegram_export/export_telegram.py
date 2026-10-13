#!/usr/bin/env python3
"""
Выгрузка постов из Telegram-каналов в JSON для анализа.

Скрипт работает ТОЛЬКО на чтение: ничего не отправляет, не удаляет
и не меняет в аккаунте.

Использование:
    pip install telethon
    python export_telegram.py --list                  # показать ваши каналы/чаты
    python export_telegram.py --days 7                # выгрузить каналы из channels.txt за 7 дней
    python export_telegram.py --days 3 @channel1 @channel2

Ключи API берутся с https://my.telegram.org -> API development tools.
Их можно задать переменными окружения TG_API_ID / TG_API_HASH,
иначе скрипт спросит при запуске.
"""
import argparse
import asyncio
import json
import os
import sys
from datetime import datetime, timedelta, timezone
from pathlib import Path

try:
    from telethon import TelegramClient
    from telethon.tl.types import Channel, Chat
except ImportError:
    sys.exit("Не установлен telethon. Выполните: pip install telethon")

HERE = Path(__file__).resolve().parent
SESSION = HERE / "tg_session"          # файл сессии — НИКОМУ не передавать
CHANNELS_FILE = HERE / "channels.txt"
OUT_DIR = HERE / "export"


def get_credentials():
    api_id = os.environ.get("TG_API_ID") or input("api_id: ").strip()
    api_hash = os.environ.get("TG_API_HASH") or input("api_hash: ").strip()
    return int(api_id), api_hash


def read_channels(cli_channels):
    if cli_channels:
        return cli_channels
    if not CHANNELS_FILE.exists():
        sys.exit(f"Укажите каналы аргументами или в файле {CHANNELS_FILE.name} (по одному в строке)")
    lines = CHANNELS_FILE.read_text(encoding="utf-8").splitlines()
    return [l.strip() for l in lines if l.strip() and not l.lstrip().startswith("#")]


def normalize(ref):
    """'https://t.me/foo', 't.me/foo', '@foo' -> 'foo'; числовой id остаётся числом."""
    ref = ref.strip().rstrip("/")
    for prefix in ("https://", "http://"):
        if ref.startswith(prefix):
            ref = ref[len(prefix):]
    if ref.startswith("t.me/"):
        ref = ref[len("t.me/"):]
        if ref.startswith("s/"):
            ref = ref[2:]
    ref = ref.lstrip("@")
    try:
        return int(ref)
    except ValueError:
        return ref


async def list_dialogs(client):
    print(f"{'тип':<8} {'username / id':<35} название")
    async for d in client.iter_dialogs():
        ent = d.entity
        if isinstance(ent, Channel):
            kind = "канал" if ent.broadcast else "группа"
        elif isinstance(ent, Chat):
            kind = "группа"
        else:
            continue
        ref = f"@{ent.username}" if getattr(ent, "username", None) else str(d.id)
        print(f"{kind:<8} {ref:<35} {d.name}")


async def export(client, channels, days, limit):
    since = datetime.now(timezone.utc) - timedelta(days=days)
    OUT_DIR.mkdir(exist_ok=True)
    result = {"exported_at": datetime.now(timezone.utc).isoformat(), "days": days, "channels": []}

    for ref in channels:
        try:
            ent = await client.get_entity(normalize(ref))
        except Exception as e:
            print(f"[!] {ref}: не удалось открыть ({e})")
            continue

        username = getattr(ent, "username", None)
        posts = []
        async for m in client.iter_messages(ent, limit=limit):
            if m.date < since:
                break
            text = m.message or ""
            if not text.strip():
                continue  # пропускаем посты без текста (только медиа)
            posts.append({
                "id": m.id,
                "date": m.date.isoformat(),
                "text": text,
                "views": m.views,
                "forwards": m.forwards,
                "link": f"https://t.me/{username}/{m.id}" if username else None,
            })

        title = getattr(ent, "title", str(ref))
        print(f"[+] {title}: {len(posts)} постов")
        result["channels"].append({"ref": str(ref), "title": title, "username": username, "posts": posts})

    stamp = datetime.now().strftime("%Y-%m-%d_%H%M")
    out = OUT_DIR / f"telegram_{stamp}.json"
    out.write_text(json.dumps(result, ensure_ascii=False, indent=2), encoding="utf-8")
    total = sum(len(c["posts"]) for c in result["channels"])
    print(f"\nГотово: {total} постов -> {out}")


async def main():
    p = argparse.ArgumentParser(description="Выгрузка постов из Telegram-каналов в JSON")
    p.add_argument("channels", nargs="*", help="@username, ссылка t.me/... или id")
    p.add_argument("--list", action="store_true", help="показать ваши каналы и группы")
    p.add_argument("--days", type=int, default=7, help="за сколько дней выгружать (по умолч. 7)")
    p.add_argument("--limit", type=int, default=500, help="макс. постов на канал (по умолч. 500)")
    args = p.parse_args()

    api_id, api_hash = get_credentials()
    async with TelegramClient(str(SESSION), api_id, api_hash) as client:
        if args.list:
            await list_dialogs(client)
        else:
            await export(client, read_channels(args.channels), args.days, args.limit)


if __name__ == "__main__":
    asyncio.run(main())
