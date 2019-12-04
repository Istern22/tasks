package com.github.istern22.mezentsev;

import java.util.ArrayList;
import java.util.List;

public class Text {

    public final static char[] vowels = {'А', 'а', 'О', 'о', 'И', 'и', 'Е', 'е', 'Э', 'э', 'Ы', 'ы', 'У', 'у', 'Ю', 'ю', 'Я', 'я'};
    public final static char[] consonants = {'А', 'а', 'О', 'о', 'И', 'и', 'Е', 'е', 'Э', 'э', 'Ы', 'ы', 'У', 'у', 'Ю', 'ю', 'Я', 'я'};

    /**
     * В текстовом окне задан многострочный текст. Слова отделяются друг от друга пробелами.
     * Каждое предложение в тексте заканчивается точкой.
     * Последовательно выделять слова, где гласных букв не меньше чем согласных.
     * @param text
     * @return
     */
    public static List<String> function1(String text) {
        List<String> result = new ArrayList<>();
        String[] words = text.split("[. ]");
        for (int i = 0; i < words.length; i++) {

        }
        return result;
    }
}
