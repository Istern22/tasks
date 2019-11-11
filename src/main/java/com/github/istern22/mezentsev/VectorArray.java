package com.github.istern22.mezentsev;

import java.util.ArrayList;
import java.util.List;

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

    /**
     * Даны действительные числа с1, с2, ..., сn.
     *  Найти произведение среднего арифметического положительных чисел
     *  и среднее арифметического отрицательных чисел.
     * @param array
     * @return
     */
    public static double multiplyAverages(double[] array) {
        int countPositive = 0;
        int countNegative = 0;
        double sumPositive = 0;
        double sumNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                sumPositive += array[i];
                countPositive++;
            } else {
                sumNegative += array[i];
                countNegative++;
            }
        }
        return (sumPositive / countPositive) * (sumNegative / countNegative);
    }

    /**
     * Даны действительные числа с1, с2, ..., сn.
     * Найти произведение суммы чисел с четными индексами и суммы чисел с нечетными индексами.
     * @param array
     * @return
     */
    public static double multiplyOfSums(double[] array) {
        double sumOdd = 0;
        double sumEven = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                sumEven += array[i];
            } else {
                sumOdd += array[i];
            }
        }
        return sumEven * sumOdd;
    }

    /**
     * Даны действительные числа a1, a2, ..., an.
     * Выяснить, есть ли среди них повторяющиеся числа,
     * и найти среднее арифметическое без учета повторов.
     * @param array
     * @return
     */
    public static double averageWithoutDuplicates(double[] array) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] != array[j]) {
                    sum += array[i];
                    count++;
                }
            }
        }
        return sum / count;
    }

    /**
     * Даны действительные числа a1, a2, ..., an.
     * Пусть М - наибольшее, а м-наименьшее этих чисел.
     * Получить в порядке возрастания все целые из интервала(м, М),
     * которые не входят в последовательность a1, a2, ..., an.
     * @param array
     * @return
     */
    public static List<Integer> numbersFromInterval(int[] array) {
        List<Integer> result = new ArrayList<>();
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
           if (array[i] > array[maxIndex]) {
               maxIndex = i;
           } else if (array[i] < array[minIndex]) {
               minIndex = i;
           }
        }

        for (int number = array[minIndex] + 1; number < array[maxIndex]; number++) {
            boolean duplicate = false;
            for (int i = 0; i < array.length; i++) {
                if (number == array[i]) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                result.add(number);
            }
        }
        return result;
    }
}
