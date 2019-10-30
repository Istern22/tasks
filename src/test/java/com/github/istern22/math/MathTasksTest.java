package com.github.istern22.math;

import org.junit.Test;

import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MathTasksTest {

    @Test
    public void whenFunction221() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.function221(2), is(28.0));
    }

    @Test
    public void whenFunction222() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.function222(1), is(3.0));
    }

    @Test
    public void whenFunction23() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.function23(0), is(10.0));
    }

    @Test
    public void whenFunction241() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.function241(0), is(0.0));
    }

    @Test
    public void whenFunction242() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.function242(3), is(0.3397646658918319));
    }

    @Test
    public void whenPerimetrSquare() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.perimeterSquare(5), is(20.0));
    }

    @Test
    public void whenDiameter() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.diameter(5), is(10.0));
    }

    @Test
    public void whenCircumference() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.circumference(4), is(25.132741228718345));
    }

    @Test
    public void whenCircleArea() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.circleArea(4), is(50.26548245743669));
    }

    @Test
    public void whenFunction1301() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.function1301(4, 5), is(30.980000000000004));
    }

    @Test
    public void whenFunction1302() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.function1302(4, 5), is(7.940000000000008));
    }

    @Test
    public void whenFunction1311() {
        MathTasks mathTasks = new MathTasks();
        assertThat(mathTasks.function1311(4, 5), is(4.5));
    }
}