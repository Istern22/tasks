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
    public double averageArithmetic(int a, int b) {
        return (double) (a + b) / 2;
    }

    public double averageGeometric(int a, int b) {
        return (double) sqrt(a * b);
    }

    /**
     * Известны объем и масса тела. Определить плотность материала этого тела.
     * @param volume
     * @param mass
     * @return
     */
    public double density(double volume, double mass) {
        return mass / volume;
    }

    /**
     * Известны количество жителей в государстве и площадь его территории.
     * Определить плотность населения в этом государстве.
     * @param populationSize
     * @param stateArea
     * @return
     */
    public double populationDensity(int populationSize, double stateArea) {
        return populationSize / stateArea;
    }

    /**
     * Составить программу решения линейного уравнения ax + b = 0 (a != 0).
     * @param a
     * @param b
     * @return
     */
    public double function134(double a, double b) {
        if (a == 0) {
            throw new ArithmeticException("a = 0");
        }
        return -b / a;
    }

    /**
     * Даны катеты прямоугольного треугольника. Найти его гипотенузу.
     * @param a
     * @param b
     * @return
     */
    public double hypotenuseTriangle(double a, double b) {
        return sqrt(pow(a, 2) + pow(b, 2));
    }

    /**
     * Найти площадь кольца по заданным внешнему и внутреннему радиусам.
     * @param radius1
     * @param radius2
     * @return
     */
    public double ringArea(double radius1, double radius2) {
        return circleArea(radius1) - circleArea(radius2);
    }

    /**
     * Даны катеты прямоугольного треугольника. Найти его периметр.
     * @param a
     * @param b
     * @return
     */
    public double perimeterTriangle(double a, double b) {
        return a + b + hypotenuseTriangle(a, b);
    }

    /**
     * Даны основания и высота равнобедренной трапеции. Найти ее периметр.
     * @param h
     * @param a
     * @param b
     * @return
     */
    public double perimeterTrapezoid(double h, double a, double b) {
        return a + b + 2 * hypotenuseTriangle(h, abs((a - b) / 2));
    }

    /**
     * Составить программу вычисления значений функций
     * (x + (2 + y) / pow(x, 2)) / (y + 1 / sqrt(pow(x, 2) + 10))
     * 2.8 * sin(x) + abs(y)
     * @param x
     * @param y
     * @return
     */
    public double function1391(double x, double y) {
        return (x + (2 + y) / pow(x, 2)) / (y + 1 / sqrt(pow(x, 2) + 10));
    }

    public double function1392(double x, double y) {
        return 2.8 * sin(x) + abs(y);
    }

    /**
     * Даны два числа. Найти их сумму, разность, произведение, а также частное от
     * деления первого числа на второе.
     * @param x
     * @param y
     * @return
     */
    public double function145Sum(double x, double y) {
        return x + y;
    }

    public double function145Difference(double x, double y) {
        return x - y;
    }

    public double function145Multiplication(double x, double y) {
        return x * y;
    }

    public double function145Division(double x, double y) {
        return x / y;
    }

    /**
     * Даны длины сторон прямоугольного параллелепипеда.
     * Найти его объем и площадь боковой поверхности.
     * @param a
     * @param b
     * @param c
     * @return
     */
    public double parallelepipedVolume(double a, double b, double c) {
        return a * b * c;
    }

    public double parallelepipedSideArea(double a, double b, double c) {
        return 2 * (a * b + a * c);
    }

    /**
     * Известны координаты на плоскости двух точек. Составить программу вычис-
     * ления расстояния между ними.
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    public double distanceBetweenPoints(double x1, double y1, double x2, double y2) {
        return sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
    }

    /**
     * Известна стоимость 1 кг конфет, печенья и яблок.
     * Найти стоимость всей покупки, если купили x кг конфет, у кг печенья и z кг яблок.
     * @param cost
     * @param x
     * @param y
     * @param z
     */
    public double function152(double x, double y, double z, double cost) {
        return cost * (x + y + z);
    }

    /**
     * Известна стоимость монитора, системного блока, клавиатуры и мыши.
     * Сколько будут стоить 3 компьютера из этих элементов? N компьютеров?
     * @param cost
     * @return
     */
    public double function1531(double cost) {
        return 3 * cost;
    }

    public double function1532(double cost, int computers) {
        return computers * cost;
    }

    /**
     * Возраст Тани — X лет, а возраст Мити — Y лет. Найти их средний возраст, а
     * также определить, на сколько отличается возраст каждого ребенка
     * от среднего значения.
     * @param x
     * @param y
     * @return
     */
    public double averageAge(double x, double y) {
        return (x + y) / 2;
    }

    public double differenceFromAverage(double x, double y) {
        return abs(averageAge(x, y) - x);
    }

    /**
     * Два автомобиля едут навстречу друг другу с постоянными скоростями V1 и
     * V2 км/час. Определить, через какое время автомобили встретятся, если рас-
     * стояние между ними было S км.
     * @param v1
     * @param v2
     * @param s
     * @return
     */
    public double function155(double v1, double v2, double s) {
        return s / (v1 + v2);
    }

    /**
     * Два автомобиля едут друг за другом с постоянными скоростями V1 и
     * V2 км/час ( V1 V2 ). Определить, какое расстояние будет между ними через
     * 30 минут после того, как первый автомобиль опередил второй на S км.
     * @param v1
     * @param v2
     * @param s
     * @return
     */
    public double function156(double v1, double v2, double s) {
        return 0.5 * v1 + s - 0.5 * v2;
    }

    /**
     * Известно значение температуры по шкале Цельсия. Найти соответствующее
     * значение температуры по шкале:
     * а) Фаренгейта;
     * б) Кельвина.
     * @param c
     * @return
     */
    public double convertIntoFahrenheit(double c) {
        return c * 1.8 + 32;
    }

    public double convertIntoKelvin(double c) {
        return c + 273.15;
    }

    /**
     * У американского писателя-фантаста Рэя Бредбери есть роман "450 градусов
     * по Фаренгейту". Какой температуре по шкале Цельсия соответствует указан-
     * ное в названии значение?
     * @param f
     * @return
     */
    public double convertInCelsius(double f) {
        return (f - 32) / 1.8;
    }

    /**
     * Составить программу обмена значениями двух переменных величин.
     * @param a
     * @param b
     */
    public void changeTwoValues(double a, double b) {
        a = a + b;
        b = a - b;
        a = a - b;
    }

    /**
     * Составить программу обмена значениями трех переменных величин а, b, c по
     * следующей схеме:
     * а) b присвоить значение c, а присвоить значение b, с присвоить значение а;
     * б) b присвоить значение а, с присвоить значение b, а присвоить значение с.
     * @param a
     * @param b
     * @param c
     */

    public void changeThreeValues1(double a, double b, double c) {
        b = a + b + c;
        a = b - a - c;
        c = b - a - c;
        b = b - a - c;
    }

    public void changeThreeValues2(double a, double b, double c) {
        a = a + b + c;
        b = a - b - c;
        c = a - b - c;
        a = a - b - c;
    }

    /**
     * Дано вещественное число а.
     * Пользуясь только операцией умножения, получить:
     * а4 за 2 операции
     * а6 за 3 операции
     * а7 за 4 операции
     * а8 за 3 операции
     * а9 за 4 операции
     * а10 за 4 операции
     * а13 за 5 операций
     * а15 за 5 операций
     * а21 за 6 операций
     * а28 за 6 операций
     * а64 за 6 операций
     * @param a
     */
    public void degreesOfA(double a) {
        double a2 = a * a;
        double a4 = a2 * a2;
        double a6 = a2 * a4;
        double a7 = a6 * a;
        double a8 = a4 * a4;
        double a9 = a8 * a;
        double a10 = a8 * a2;
        double a13 = a6 * a7;
        double a15 = a7 * a8;
        double a21 = a15 * a6;
        double a28 = a21 * a7;
        double a64 = a28 * a28 * a8;

    }

    /**
     * Дано вещественное число a.
     * Пользуясь только операцией умножения, получить
     * а3 и a10 за 4 операции
     * а4 и а20 за 5 операций
     * а5 и а13 за 5 операций
     * а5 и а19 за 5 операций
     * а2, а5, а17 за 6 операций
     * а4, а12, а28 за 6 операций
     * @param a
     */
    public void degreesOfA10(double a) {
        double a2 = a * a;
        double a3 = a2 * a;
        double a5 = a3 * a2;
        double a10 = a5 * a5;
    }

    public void degreesOfA20(double a) {
        double a2 = a * a;
        double a4 = a2 * a2;
        double a10 = a4 * a4 * a2;
        double a20 = a10 * a10;
    }

    public void degreesOfA13(double a) {
        double a2 = a * a;
        double a4 = a2 * a2;
        double a5 = a4 * a;
        double a8 = a4 * a4;
        double a13 = a5 * a8;
    }

    public void degreesOfA19(double a) {
        double a2 = a * a;
        double a4 = a2 * a2;
        double a5 = a4 * a;
        double a10 = a5 * a5;
        double a19 = a10 * a4 * a5;
    }

    public void degreesOfA17(double a) {
        double a2 = a * a;
        double a4 = a2 * a2;
        double a5 = a4 * a;
        double a10 = a5 * a5;
        double a17 = a10 * a2 * a5;
    }

    public void degreesOfA28(double a) {
        double a2 = a * a;
        double a4 = a2 * a2;
        double a8 = a4 * a4;
        double a12 = a8 * a4;
        double a28 = a12 * a12 * a4;
    }
}