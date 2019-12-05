package com.github.istern22.mezentsev;

import java.util.*;

public class Text {

    public final static char[] vowels = {'а', 'о', 'и', 'е', 'э', 'ы', 'у', 'ю', 'я'};
    public final static char[] consonants = {'б', 'в', 'г', 'д', 'ж', 'з', 'й', 'к', 'л', 'м', 'н', 'п', 'р', 'с', 'т', 'ф', 'х', 'ц', 'ч', 'ш', 'щ'};

    /**
     * В текстовом окне задан многострочный текст. Слова отделяются друг от друга пробелами.
     * Каждое предложение в тексте заканчивается точкой.
     * Последовательно выделять слова, где гласных букв не меньше чем согласных.
     * @param text
     * @return
     */
    public static List<String> function1(String text) {
        List<String> result = new ArrayList<>();
        String[] words = text.split("[ .]");
        for (int i = 0; i < words.length; i++) {
            char[] word = words[i].toCharArray();
            int countVowels = 0;
            int countConsonants = 0;
            for (int j = 0; j < word.length; j++) {
                if (Arrays.asList(vowels).contains(word[i])) {
                    countVowels++;
                } else {
                    if (Arrays.asList(consonants).contains(word[i])) {
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
}
