package com.github.istern22.zlatopolskiy;

import org.junit.Test;

import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MathTasksTest {

    MathTasks mathTasks = new MathTasks();

    @Test
    public void whenFunction221() {
        assertThat(mathTasks.function221(2), is(28.0));
    }

    @Test
    public void whenFunction222() {
        assertThat(mathTasks.function222(1), is(3.0));
    }

    @Test
    public void whenFunction23() {
        assertThat(mathTasks.function23(0), is(10.0));
    }

    @Test
    public void whenFunction241() {
        assertThat(mathTasks.function241(0), is(0.0));
    }

    @Test
    public void whenFunction242() {
        assertThat(mathTasks.function242(3), is(0.3397646658918319));
    }

    @Test
    public void whenPerimeterSquare() {
        assertThat(mathTasks.perimeterSquare(5), is(20.0));
    }

    @Test
    public void whenDiameter() {
        assertThat(mathTasks.diameter(5), is(10.0));
    }

    @Test
    public void whenCircumference() {
        assertThat(mathTasks.circumference(4), is(25.132741228718345));
    }

    @Test
    public void whenCircleArea() {
        assertThat(mathTasks.circleArea(4), is(50.26548245743669));
    }

    @Test
    public void whenFunction1301() {
        assertThat(mathTasks.function1301(4, 5), is(30.980000000000004));
    }

    @Test
    public void whenFunction1302() {
        assertThat(mathTasks.function1302(4, 5), is(7.940000000000008));
    }

    @Test
    public void whenAverageArithmetic() {
        assertThat(mathTasks.averageArithmetic(4, 5), is(4.5));
    }

    @Test
    public void whenAverageGeometric() {
        assertThat(mathTasks.averageGeometric(4, 5), is(4.47213595499958));
    }

    @Test
    public void whenDensity() {
        assertThat(mathTasks.density(4, 2), is(0.5));
    }

    @Test
    public void whenPopulationDensity() {
        assertThat(mathTasks.populationDensity(100, 50), is(2.0));
    }

    @Test
    public void whenFunction134() {
        assertThat(mathTasks.function134(100, 50), is(-0.5));
    }

    @Test(expected = ArithmeticException.class)
    public void whenFunction134WhenException() {
        assertThat(mathTasks.function134(0, 50), is("a = 0"));
    }

    @Test
    public void whenHypotenuse() {
        assertThat(mathTasks.hypotenuseTriangle(4, 3), is(5.0));
    }

    @Test
    public void whenRingArea() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.ringArea(4, 2), is(37.69911184307752));
    }

    @Test
    public void whenPerimeter() {
        assertThat(mathTasks.perimeterTriangle(4, 3), is(12.0));
    }

    @Test
    public void whenPerimeterTrapezoid() {
        assertThat(mathTasks.perimeterTrapezoid(4, 3, 2), is(13.06225774829855));
    }

    @Test
    public void whenFunction1391() {
        assertThat(mathTasks.function1391(4, 3), is(1.3492938984876872));
    }

    @Test
    public void whenFunction1392() {
        assertThat(mathTasks.function1392(4, 3), is(0.8809530131378014));
    }

    @Test
    public void whenFunction145Sum() {
        assertThat(mathTasks.function145Sum(4, 3), is(7.0));
    }

    @Test
    public void whenFunction145Difference() {
        assertThat(mathTasks.function145Difference(4, 3), is(1.0));
    }

    @Test
    public void whenFunction145Multiple() {
        assertThat(mathTasks.function145Multiplication(4, 3), is(12.0));
    }

    @Test
    public void whenFunction145Division() {
        assertThat(mathTasks.function145Division(4, 3), is(1.3333333333333333));
    }

    @Test
    public void whenParallelepipedVolume() {
        assertThat(mathTasks.parallelepipedVolume(4, 3, 1), is(12.0));
    }

    @Test
    public void whenParallelepipedSideArea() {
        assertThat(mathTasks.parallelepipedSideArea(4, 3, 1), is(32.0));
    }

    @Test
    public void whenDistanceBetweenPoints() {
        assertThat(mathTasks.distanceBetweenPoints(1, 2, 3, 4), is(2.8284271247461903));
    }

    @Test
    public void whenFunction152() {
        assertThat(mathTasks.function152(1, 2, 3, 4), is(24.0));
    }

    @Test
    public void whenFunction1531() {
        assertThat(mathTasks.function1531(10), is(30.0));
    }

    @Test
    public void whenFunction1532() {
        assertThat(mathTasks.function1532(10, 5), is(50.0));
    }

    @Test
    public void whenAverageAge() {
        assertThat(mathTasks.averageAge(10, 5), is(7.5));
    }

    @Test
    public void whenDifferenceFromAverage() {
        assertThat(mathTasks.differenceFromAverage(10, 5), is(2.5));
    }

    @Test
    public void whenFunction155() {
        assertThat(mathTasks.function155(10, 40, 100), is(2.0));
    }

    @Test
    public void whenFunction156() {
        assertThat(mathTasks.function156(10, 5, 10), is(12.5));
    }

    @Test
    public void whenConvertIntoFarenheit() {
        assertThat(mathTasks.convertIntoFahrenheit(0), is(32.0));
    }

    @Test
    public void whenConvertIntoKelvin() {
        assertThat(mathTasks.convertIntoKelvin(0), is(273.15));
    }

    @Test
    public void whenConvertIntoCelsius() {
        assertThat(mathTasks.convertInCelsius(450), is(232.22222222222223));
    }
}