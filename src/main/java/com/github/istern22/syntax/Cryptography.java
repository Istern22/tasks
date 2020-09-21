package com.github.istern22.syntax;

public class Cryptography {
    public static String code(String s) {
        if (s == "") {
            return "empty";
        }
        StringBuilder sb = new StringBuilder(s);
        if (s.length() > 4) {
            for (int i = 0; i < s.length() - 4; i++) {
                sb.setCharAt(i, '#');
            }
        }
        return sb.toString();
    }
}
