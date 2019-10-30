package com.github.istern22.math;

import static java.lang.Math.*;

public class MathTasks {

    /**
     * Вычисление значения функции
     * y = 7 * pow(x, 2) - 3 * x + 6 при любом значении x;
     * @param x
     * @return
     */
    public double function221(double x) {
       return 7 * pow(x, 2) - 3 * x + 6;
    }

    /**
     * Вычисление значения функции
     * x = 12 * pow(a, 2) + 7 * a - 16 при любом значении a;
     * @param a
     * @return
     */
    public double function222(double a) {
        return 12 * pow(a, 2) + 7 * a - 16;
    }

    /**
     * Вычисление значения функции
     * y = (pow(a, 2) + 10) / sqrt(pow(a, 2) + 1) при любом значении a;
     * @param a
     * @return
     */
    public double function23(double a) {
        return (pow(a, 2) + 10) / sqrt(pow(a, 2) + 1);
    }

    /**
     * Вычисление значения функции
     * y = sqrt((2 * a + sin(abs(3 * a))) / 3.56) при любом значении a;
     * @param a
     * @return
     */
    public double function241(double a) {
        return sqrt((2 * a + sin(abs(3 * a))) / 3.56);
    }

    /**
     * Вычисление значения функции
     * y = sin((3.2 + sqrt(1 + x)) / abs(5 * x) при любом значении a;
     * @param x
     * @return
     */
    public double function242(double x) {
        return sin((3.2 + sqrt(1 + x)) / abs(5 * x));
    }

    /**
     * Дана сторона квадрата. Найти его периметр.
     * @param x
     * @return
     */
    public double perimeterSquare(double x) {
        return 4 * x;
    }

    /**
     * Дана сторона квадрата. Найти его периметр.
     * @param x
     * @return
     */
    public double diameter(double x) {
        return x * 2;
    }

    /**
     * Дан радиус окружности. Найти длину окружности и площадь круга.
     * @param r
     * @return
     */
    public double circumference(double r) {
        return 2 * PI * r;
    }

    public double circleArea(double r) {
        return PI * pow(r, 2);
    }

    /**
     * Составить программу:
     * вычисления значения функции
     * pow(x, 3) - 2.5 * x * y + 1.78 * pow(x, 2) - 2.5 * y + 1
     * при любых значениях х и y;
     * @param x
     * @param y
     * @return
     */
    public double function1301(double x, double y) {
        return pow(x, 3) - 2.5 * x * y + 1.78 * pow(x, 2) - 2.5 * y + 1;
    }

    /**
     * Составить программу:
     * вычисления значения функции
     * 3.56 * a + pow(b, 3) - 5.8 * pow(b, 2) + 3.8 * a - 1.5
     * при любых значениях a и b;
     * @param a
     * @param b
     * @return
     */
    public double function1302(double a, double b) {
        return 3.56 * a + pow(b, 3) - 5.8 * pow(b, 2) + 3.8 * a - 1.5;
    }

    /**
     * Даны два целых числа. Найти:
     * а) их среднее арифметическое
     * б) их среднее геометрическое
     * @param a
     * @param b
     * @return
     */
    public double function1311(int a, int b) {
        return (double) (a + b) / 2;
    }
}