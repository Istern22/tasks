package com.github.istern22.mezentsev;

public class Matrix {

    /**
     * В квадратной матрице найти среднее арифметическое положительных
     * элементов главной диагонали и среднее арифметическое
     * отрицательных элементов побочной диагонали.
     * @param array
     * @return
     */
    public static double averageOfPositiveMainDiagonal(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][i] > 0) {
                sum += array[i][i];
            }
        }
        return sum / array.length;
    }

    public static double averageOfNegativeSecondaryDiagonal(double[][] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[array.length - 1 - i][i] < 0) {
                sum += array[array.length - 1 - i][i];
            }
        }
        return sum / array.length;
    }

    /**
     * Для квадратной матрицы найти разность сумм элементов над и под главной диагональю.
     * @param array
     * @return
     */
    public static double differenceOfSumsOverAndUnderDiagonal(double[][] array) {
        double sumOver = 0;
        double sumUnder = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < j) {
                    sumOver += array[i][j];
                } else {
                    if (i > j) {
                        sumUnder += array[i][j];
                    }
                }
            }
        }
        return sumOver - sumUnder;
    }

    /**
     * Дана матрица A размером m * n.
     * Найти количество строк матрицы, сумма элементов которой отрицательна.
     * @param array
     * @return
     */
    public static int rowsOfNegativeSum(double[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            double sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum < 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Дана целочисленная квадратная матрица.
     * Проверить, является ли она магическим квадратом.
     * @param array
     * @return
     */
    public static boolean magicMatrix(int[][] array) {
        boolean result = false;
        double sumMain = 0;
        double sumSecondary = 0;
        for (int i = 0; i < array.length; i++) {
            sumMain += array[i][i];
            sumSecondary += array[array.length - 1 - i][i];
        }

        if (sumMain == sumSecondary) {
            double sumRows = 0;
            double sumColumns = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    sumRows += array[i][j];
                    sumColumns += array[j][i];
                }
                if (sumRows == sumMain && sumRows == sumColumns) {
                    result = true;
                    sumRows = 0;
                    sumColumns = 0;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    /**
     * Дана целочисленная квадратная матрица.
     * Проверить, является ли она латинским квадратом.
     * @param array
     * @return
     */
    public static boolean latinMatrix(int[][] array) {
        boolean result = true;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                for (int n = j + 1; n < array.length; n++) {
                    if (array[i][j] == array[i][n] || array[j][i] == array[n][i]) {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }

    /**
     * Дана целочисленная квадратная матрица. Написать программу,
     * вычисляющую наименьшее значение среди компонентов матрицы
     * расположенных ниже главной диагонали.
     * @param array
     * @return
     */
    public static int minUnderMainDiagonal(int[][] array) {
        int min = array[1][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i > j && array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    /**
     * Дана целочисленная квадратная матрица. Написать программу,
     * вычисляющую наименьшее значение среди компонентов матрицы
     * расположенных выше главной диагонали.
     * @param array
     * @return
     */
    public static int minAboveMainDiagonal(int[][] array) {
        int min = array[0][1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < j && array[i][j] < min) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    /**
     * Дана целочисленная квадратная матрица. Написать программу,
     * вычисляющую наибольшее значение среди компонентов матрицы
     * расположенных ниже главной диагонали.
     * @param array
     * @return
     */
    public static int maxUnderMainDiagonal(int[][] array) {
        int max = array[1][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i > j && array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Дана целочисленная квадратная матрица. Написать программу,
     * вычисляющую наибольшее значение среди компонентов матрицы
     * расположенных выше главной диагонали.
     * @param array
     * @return
     */
    public static int maxAboveMainDiagonal(int[][] array) {
        int max = array[0][1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < j && array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    /**
     * Дана целочисленная квадратная матрица. Написать программу,
     * вычисляющую наименьшее значение среди компонентов матрицы
     * расположенных выше главной и выше побочной диагонали.
     * @param array
     * @return
     */
    public static int minAboveMainAndSideDiagonal(int[][] array) {
        int min = array[0][1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < j && i < array.length - 1 - i && min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    /**
     * Дана целочисленная квадратная матрица. Написать программу,
     * вычисляющую наименьшее значение среди компонентов матрицы
     * расположенных выше главной и ниже побочной диагонали.
     * @param array
     * @return
     */
    public static int minAboveMainAndUnderSideDiagonal(int[][] array) {
        int min = array[array.length - 2][array.length - 1];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i < j && j > array.length - 1 - i && min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }
}
