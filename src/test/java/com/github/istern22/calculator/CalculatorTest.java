package com.github.istern22.calculator;

import org.junit.Test;

import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenConvertToRPN() {
        Calculator calculator = new Calculator();
        assertThat(calculator.toReversePolishNotation("(8 + 2 * 5)/(1 + 3 * 2 - 4)"), is("825*+132*+4-/"));
    }

}