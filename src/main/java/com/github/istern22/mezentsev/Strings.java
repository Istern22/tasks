package com.github.istern22.mezentsev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Strings {

    /**
     * Дана строка символов. Слова в строке отделяются друг от друга
     * одним пробелом. Вывести самое длинное слово.
     * @param string
     * @return
     */
    public static String maxString(String string) {
        String maxWord = "";
        String[] words = string.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (maxWord.length() < words[i].length()) {
                maxWord = words[i];
            }
        }
        return maxWord;
    }

    /**
     * Дана строка символов. Слова в строке отделяются друг от друга
     * одним пробелом. Вывести самое короткое слово.
     * @param string
     * @return
     */
    public static String minString(String string) {
        String[] words = string.split(" ");
        String minWord = words[0];
        for (int i = 0; i < words.length; i++) {
            if (minWord.length() > words[i].length()) {
                minWord = words[i];
            }
        }
        return minWord;
    }

    /**
     * Дана строка символов. Слова в строке отделяются друг от друга
     * одним пробелом. Написать программу, вычисляющую среднюю длину слов в строке.
     * @param string
     * @return
     */
    public static double averageWordLength(String string) {
        String[] words = string.split(" ");
        int sumLength = 0;
        for (int i = 0; i < words.length; i++) {
            sumLength += words[i].length();
        }
        return (double) sumLength / words.length;
    }

    public static String deleteMaxWord(String string) {
        String result = "";
        List<String> words = new ArrayList<>(Arrays.asList(string.split(" ")));
        words.remove(maxString(string));
        for (int i = 0; i < words.size(); i++) {
            result += words.get(i);
            if (i != words.size() - 1) {
                result += " ";
            }
        }
        return result;
    }
}
