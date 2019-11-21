package com.github.istern22.mezentsev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Strings {

    /**
     * Дана строка символов. Слова в строке отделяются друг от друга
     * одним пробелом. Вывести самое длинное слово.
     *
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
     *
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
     *
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

    /**
     * Дана строка символов. Слова в строке отделяются друг от друга
     * одним пробелом. Удалить самое длинное слово. Удалить самое короткое слово.
     *
     * @param string
     * @return
     */

    public static String deleteWord(String string, String word) {
        String result = string.replace(word, "").replace("  ", " ").trim();
        return result;
    }

    public static String deleteMaxWord(String string) {
        return deleteWord(string, maxString(string));
    }

    public static String deleteMinWord(String string) {
        return deleteWord(string, minString(string));
    }

    /**
     * Дана строка символов. Слова в строке отделяются друг от друга одним пробелом.
     * Заменить в строке одно заданное слово(если оно есть) другим.
     *
     * @param string
     * @param word1
     * @param word2
     * @return
     */
    public static String replaceWord(String string, String word1, String word2) {
        string = string.replace(word1, word2);
        return string;
    }

    /**
     * Дана строка символов. Слова в строке отделяются друг от друга любым количеством пробелов.
     * Преобразовать строку таким образом, чтобы слова отделялись строго одним пробелом.
     *
     * @param string
     * @return
     */
    public static String oneSpace(String string) {
        string = string.replaceAll(" +", " ");
        return string;
    }

    /**
     * Дана строка символов. Слова в строке отделяются друг от друга одним пробелом.
     * Поменять местами самое длинное и самое короткое слово.
     *
     * @param string
     * @return
     */
    public static String replaceMinMax(String string) {
        String min = minString(string);
        String max = maxString(string);
        string = string.replace(min, "min").replace(max, "max");
        string = string.replace("min", max).replace("max", min);
        return string;
    }

    /**
     * Дана строка символов. Слова в строке отделяются друг от друга пробелами или запятыми.
     * Посчитать кол-во слов, длина которых больше заданного числа.
     * Посчитать кол-во слов, длина которых меньше заданного числа.
     *
     * @param string
     * @param length
     * @return
     */
    public static int writeWordsToLengthNumber(String string, int length, boolean sign) {
        String[] words = string.split("[ ,]");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (sign && words[i].length() > length) {
                count++;
            } else {
                if (!sign && words[i].length() < length) {
                    count++;
                }
            }
        }
        return count;
    }
}
