package com.github.istern22.mezentsev;

import java.util.*;

public class Text {

    public final static Character[] vowels = {'а', 'о', 'и', 'е', 'э', 'ы', 'у', 'ю', 'я'};
    public final static Character[] consonants = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};
    public final static HashSet<Character> vowelsHash = new HashSet<>(Arrays.asList(vowels));
    public final static HashSet<Character> consonantsHash = new HashSet<>(Arrays.asList(consonants));

    /**
     * В текстовом окне задан многострочный текст. Слова отделяются друг от друга пробелами.
     * Каждое предложение в тексте заканчивается точкой.
     * Последовательно выделять слова, где гласных букв не меньше чем согласных.
     * @param text
     * @return
     */
    public static List<String> function1(String text) {
        List<String> result = new ArrayList<>();
        String[] words = text.replaceAll("[.]", "").split("[ ]");
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            int countVowels = 0;
            int countConsonants = 0;
            for (int j = 0; j < word.length; j++) {
                if (word[j] != ' ') {
                    Character x = Character.toLowerCase(word[j]);
                    if (vowelsHash.contains(x)) {
                        countVowels++;
                    } else if (consonantsHash.contains(x)) {
                            countConsonants++;
                    }
                }
            }
            if (countVowels >= countConsonants) {
                result.add(words[i]);
            }
        }
        return result;
    }

    /**
     * Последовательно выделять слова, где согласных букв больше чем гласных.
     * @param text
     * @return
     */
    public static List<String> function2(String text) {
        List<String> result = new ArrayList<>();
        String[] words = text.replaceAll("[.]", "").split("[ ]");
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            int countVowels = 0;
            int countConsonants = 0;
            for (int j = 0; j < word.length; j++) {
                if (word[j] != ' ') {
                    Character x = Character.toLowerCase(word[j]);
                    if (vowelsHash.contains(x)) {
                        countVowels++;
                    } else if (consonantsHash.contains(x)) {
                        countConsonants++;
                    }
                }
            }
            if (countVowels < countConsonants) {
                result.add(words[i]);
            }
        }
        return result;
    }

    /**
     * Последовательно выделять предложения с четным количеством слов.
     * @param text
     * @return
     */
    public static List<String> function3(String text) {
        List<String> result = new ArrayList<>();
        String[] sentences = text.split("[.]");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].trim();
            String[] words = sentences[i].split("[ ]");
            if (words.length % 2 == 0) {
                result.add(sentences[i] + ".");
            }
        }
        return result;
    }

    /**
     * Последовательно выделять предложения с нечетным количеством слов.
     * @param text
     * @return
     */
    public static List<String> function4(String text) {
        List<String> result = new ArrayList<>();
        String[] sentences = text.split("[.]");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].trim();
            String[] words = sentences[i].split("[ ]");
            if (words.length % 2 == 1) {
                result.add(sentences[i] + ".");
            }
        }
        return result;
    }

    /**
     * Последовательно выделять слова с удвоенной гласной.
     * @param text
     * @return
     */
    public static List<String> function5(String text) {
        List<String> result = new ArrayList<>();
        String[] words = text.split("[ .]");
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            for (int j = 0; j < word.length - 1; j++) {
                if (word[j] != ' ' && vowelsHash.contains(word[j]) && word[j] == word[j + 1]) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Последовательно выделять самое короткое слово в каждом предложении.
     * @param text
     * @return
     */
    public static List<String> function6(String text) {
        List<String> result = new ArrayList<>();
        String[]sentences = text.split("[.]");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].trim();
            String[] words = sentences[i].split("[ ]");
            String min = words[0];
            for (int j = 1; j < words.length; j++) {
                if (min.length() > words[j].length()) {
                    min = words[j];
                }
            }
            result.add(min);
        }
        return result;
    }

    /**
     * Последовательно выделять самое длинное слово в каждом предложении.
     * @param text
     * @return
     */
    public static List<String> function7(String text) {
        List<String> result = new ArrayList<>();
        String[] sentences = text.split("[.]");
        for (int i = 0; i < sentences.length; i++) {
            sentences[i] = sentences[i].trim();
            String[] words = sentences[i].split("[ ]");
            String max = words[0];
            for (int j = 1; j < words.length; j++) {
                if (max.length() < words[j].length()) {
                    max = words[j];
                }
            }
            result.add(max);
        }
        return result;
    }

    /**
     * Последовательно выделять слова с удвоенной согласной.
     * @param text
     * @return
     */
    public static List<String> function8(String text) {
        List<String> result = new ArrayList<>();
        String[] words = text.split("[ .]");
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            for (int j = 0; j < word.length - 1; j++) {
                if (word[j] != ' ' && consonantsHash.contains(word[j]) && word[j] == word[j + 1]) {
                    result.add(words[i]);
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Последовательно выделять слова длина которых больше заданного числа.
     * @param text
     * @param number
     * @return
     */
    public static List<String> function9(String text, int number) {
        List<String> result = new ArrayList<>();
        String[] words = text.split("[ .]");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > number) {
                result.add(words[i]);
            }
        }
        return result;
    }

    /**
     * Последовательно выделять слова длина которых меньше заданного числа.
     * @param text
     * @param number
     * @return
     */
    public static List<String> function10(String text, int number) {
        List<String> result = new ArrayList<>();
        String[] words = text.split("[ .]");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() != 0 && words[i].length() < number ) {
                result.add(words[i]);
            }
        }
        return result;
    }
}
