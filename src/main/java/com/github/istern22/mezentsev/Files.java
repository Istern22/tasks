package com.github.istern22.mezentsev;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Files {

    /**
     * Программа должна допускать следущие режимы работы:
     * 1. Ввести числа и записать их в файл.
     * 2. Прочитать все числа из файла и вывести их.
     * 3. Выполнить над числами из файла заданные действия и вывести результат.
     * @param numbers
     * @throws IOException
     */
    public static void write(int[] numbers)throws IOException {
        File file = new File("C:\\Users\\Admin_10\\test.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        for (int i = 0; i < numbers.length; i++) {
                writer.write(Integer.toString(numbers[i]));
                writer.write(" ");
        }
        writer.close();
    }

    public static void write(int number)throws IOException {
        File file = new File("C:\\Users\\Admin_10\\test.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(Integer.toString(number));
        writer.close();
    }

    public static void write(double number)throws IOException {
        File file = new File("C:\\Users\\Admin_10\\test.txt");
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        writer.write(Double.toString(number));
        writer.close();
    }

    public static int[] read()throws IOException {
        File file = new File("C:\\Users\\Admin_10\\test.txt");
        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);
        String result = "";
        while (scanner.hasNext()) {
            result = result + scanner.next() + " ";
        }
        String[] resultString = result.split(" ");
        int[] resultInt = new int[resultString.length];
        for (int i = 0; i < resultString.length; i++) {
            resultInt[i] = Integer.parseInt(resultString[i]);
        }
        return resultInt;
    }

    public static int readInt()throws IOException {
        File file = new File("C:\\Users\\Admin_10\\test.txt");
        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);
        String result = "";
        while (scanner.hasNext()) {
            result = result + scanner.next();
        }
        return Integer.parseInt(result);
    }

    public static Double readDouble()throws IOException {
        File file = new File("C:\\Users\\Admin_10\\test.txt");
        FileReader reader = new FileReader(file);
        Scanner scanner = new Scanner(reader);
        String result = "";
        while (scanner.hasNext()) {
            result = result + scanner.next();
        }
        return Double.parseDouble(result);
    }

    /**
     * Вычислить сумму всех чисел.
     * @param numbers
     * @throws IOException
     */
    public static void sum(int[] numbers) throws IOException {
        write(Arrays.stream(numbers).sum());
    }

    /**
     * Наити наибольшее число.
     * @param numbers
     * @throws IOException
     */
    public static void max(int[] numbers) throws IOException {
        write(Arrays.stream(numbers).max().getAsInt());
    }

    /**
     * Найти наименьшее число.
     * @param numbers
     * @throws IOException
     */
    public static void min(int[] numbers) throws IOException {
        write(Arrays.stream(numbers).min().getAsInt());
    }

    /**
     * Вычислить сумму положительных чисел.
     * @param numbers
     * @throws IOException
     */
    public static void sumPositive(int[] numbers) throws IOException {
        write(Arrays.stream(numbers).filter(x -> x > 0).sum());
    }

    /**
     * Вычислить сумму отрицательных чисел.
     * @param numbers
     * @throws IOException
     */
    public static void sumNegative(int[] numbers) throws IOException {
        write(Arrays.stream(numbers).filter(x -> x < 0).sum());
    }

    /**
     * Найти наибольшее среди положительных.
     * @param numbers
     * @throws IOException
     */
    public static void maxPositive(int[] numbers) throws IOException {
        write(Arrays.stream(numbers).filter(x -> x > 0).max().getAsInt());
    }

    /**
     * Найти наибольшее среди отрицательных.
     * @param numbers
     * @throws IOException
     */
    public static void maxNegative(int[] numbers) throws IOException {
        write(Arrays.stream(numbers).filter(x -> x < 0).max().getAsInt());
    }

    /**
     * Найти наименьшее среди положительных.
     * @param numbers
     * @throws IOException
     */
    public static void minPositive(int[] numbers) throws IOException {
        write(Arrays.stream(numbers).filter(x -> x > 0).min().getAsInt());
    }

    /**
     * Найти наименьшее среди отрицательных.
     * @param numbers
     * @throws IOException
     */
    public static void minNegative(int[] numbers) throws IOException {
        write(Arrays.stream(numbers).filter(x -> x < 0).min().getAsInt());
    }

    /**
     * Вычислить количество чисел, принадлежащих заданному отрезку.
     * @param numbers
     * @param a
     * @param b
     * @throws IOException
     */
    public static void numbersOfRange(int[] numbers, int a, int b) throws IOException {
        write(Arrays.stream(numbers).filter(x -> x > a && x < b).toArray().length);
    }

    /**
     * Вычислить количество чисел, не принадлежащих заданному отрезку.
     * @param numbers
     * @param a
     * @param b
     * @throws IOException
     */
    public static void numbersNotOfRange(int[] numbers, int a, int b) throws IOException {
        write(Arrays.stream(numbers).filter(x -> x < a || x > b).toArray().length);
    }

    /**
     * Вычислить границы отрезка минимальной длины, которому принадлежат все числа.
     * @param numbers
     * @throws IOException
     */
    public static void rangeOfAllNumbers(int[] numbers) throws IOException {
        write(new int[] {Arrays.stream(numbers).min().getAsInt(), Arrays.stream(numbers).max().getAsInt()});
    }

    /**
     * Вычислить среднее арифметическое положительных чисел.
     * @param numbers
     * @throws IOException
     */
    public static void averageOfPositive(int[] numbers) throws IOException {
        write(Arrays.stream(numbers).filter(x -> x > 0).average().getAsDouble());
    }

}
