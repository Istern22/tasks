package com.github.istern22.syntax;

public class Salary {
    public static int calculate(int[] hours) {
        int result = 0;
        for (int i = 0; i < hours.length; i++) {
            if (i < 5) {
                if (hours[i] <= 8) {
                    result += hours[i] * 10;
                } else {
                    result += 8 * 10 + (hours[i] - 8) * 15;
                }
            } else {
                result += hours[i] * 20;
            }
        }
        return result;
    }
}
