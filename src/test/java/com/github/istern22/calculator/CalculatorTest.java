package com.github.istern22.calculator;

import org.junit.Test;

import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenConvertToRPN() {
        Calculator calculator = new Calculator();
        assertThat(calculator.toReversePolishNotation("8 + 2"), is("82+"));
    }

}