package com.github.istern22.mezentsev;

import static com.github.istern22.mezentsev.Naturals.isPrimeNatural;

public class VectorArray {

    /**
     * Дана последовательность целых чисел а1, a2, .., an.
     * Выяснить, является ли она возрастающей последовательностью простых чисел.
     * @param array
     * @return
     */
    public static boolean increasingPrimeArray(int[] array) {
        boolean result = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (!isPrimeNatural(array[i]) || !(array[i] < array[i + 1])) {
                result = false;
            }
        }
        return result;
    }

    public static double positiveAverage(double[] array) {
        double average;
        int count = 0;
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                sum += array[i];
            }
            count++;
        }
        return sum / count;
    }

}
