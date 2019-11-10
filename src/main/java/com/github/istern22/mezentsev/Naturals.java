package com.github.istern22.mezentsev;

import javax.print.attribute.standard.PresentationDirection;
import java.util.ArrayList;
import java.util.List;

public class Naturals {

    /**
     * Проверить, является ли натуральное число числом Фибоначчи.
     * @param number
     * @return
     */
    public boolean fibonacci(int number) {
        boolean result = false;
        int previousFib = 0;
        int currentFib = 1;
        for (int i = 0; currentFib <= number; i++) {
            currentFib = previousFib + currentFib;
            previousFib = currentFib - previousFib;
            if (currentFib == number) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Проверить, являются ли все цифры данного натурального числа различными.
     * @param number
     * @return
     */
    public boolean differentDigits(int number) {
        boolean result = true;
        char[] digits = String.valueOf(number).toCharArray();
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (digits[i] == digits[j] && i != j) {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Дробь задана двумя натуральными числами - числителем и знаменателем.
     * Выяснить, является ли эта дробь нескоратимой.
     * @param numerator
     * @param denominator
     * @return
     */
    public boolean irreducibleFraction(int numerator, int denominator) {
        boolean result = false;
        return result;
    }

    public List<Integer> dividers(int number) {
        List<Integer> dividers = new ArrayList<>();

        for (int i = 2; i <= number; i++) {
            if (number % i == 0) {
                dividers.add(i);
                number = number / i;
                dividers(number);
            }
        }
        return dividers;
    }
}
