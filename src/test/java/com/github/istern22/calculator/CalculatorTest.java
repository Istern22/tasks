package com.github.istern22.calculator;

import org.junit.Test;

import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void whenConvertToRpn() {
        assertThat(Calculator.convertToRpn("( 8 + 2 * 5 ) / ( 1 + 3 * 2 - 4 )"), is("8 2 5 * + 1 3 2 * + 4 - /"));
    }

   @Test
    public void whenConvertToRpn1() {
        assertThat(Calculator.convertToRpn("2 ^ 3"), is("2 3 ^"));
    }

    @Test
    public void whenConvertToRpn2() {
        assertThat(Calculator.convertToRpn("2 ^ ( 3 + 1 )"), is("2 3 1 + ^"));
    }

    @Test
    public void whenCalculate0() {
        assertThat(Calculator.calculate("( 8 + 2 * 5 ) / ( 1 + 3 * 2 - 4 )"), is(6.0));
    }

    @Test
    public void whenCalculate1() {
        assertThat(Calculator.calculate("2 ^ 3"), is(8.0));
    }

    @Test
    public void whenCalculate2() {
        assertThat(Calculator.calculate("2 ^ ( 3 + 1 )"), is(16.0));
    }

    @Test
    public void whenCalculate3() {
        assertThat(Calculator.calculate("2 * ( 3 + 1 )"), is(8.0));
    }
}