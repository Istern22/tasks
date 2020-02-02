package com.github.istern22.calculator;

import org.junit.Test;

import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

    @Test
    public void whenConvertToRpn() {
        assertThat(Calculator.convertToRpn("( 8 + 2 * 5 ) / ( 1 + 3 * 2 - 4 )"), is("8 2 5 * + 1 3 2 * + 4 - /"));
    }

   /** @Test
    public void whenConvertToRpnExp() {
        assertThat(Calculator.convertToRpn("2 ^ 3"), is("2 3 ^"));
    }*/

    @Test
    public void whenCalculate() {
        assertThat(Calculator.calculate("( 8 + 2 * 5 ) / ( 1 + 3 * 2 - 4 )"), is(6.0));
    }
}