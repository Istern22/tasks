package com.github.istern22.mezentsev;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NaturalsTest {
    Naturals natural = new Naturals();

    @Test
    public void whenNumberIsFibonacci() {
        assertThat(natural.fibonacci(13), is(true));
    }

    @Test
    public void whenNumberIsNotFibonacci() {
        assertThat(natural.fibonacci(10), is(false));
    }

    @Test
    public void whenNumberIsSameDigits() {
        assertThat(natural.differentDigits(125648), is(true));
    }

    @Test
    public void whenNumberIsDifferentDigits() {
        assertThat(natural.differentDigits(1256458), is(false));
    }

    @Test
    public void whenTwoDividers() {
        assertThat(natural.dividers(6), is(new ArrayList<Integer>(Arrays.asList(2, 3))));
    }

    @Test
    public void whenFourDividers() {
        assertThat(natural.dividers(132), is(new ArrayList<Integer>(Arrays.asList(2, 2, 3, 11))));
    }

    @Test
    public void whenOneDividers() {
        assertThat(natural.dividers(7), is(new ArrayList<Integer>(Arrays.asList(7))));
    }

    @Test
    public void whenFractionIsReducible() {
        assertThat(natural.irreducibleFraction(5, 25), is(false));
    }

    @Test
    public void whenFractionIsReducibleTwo() {
        assertThat(natural.irreducibleFraction(132, 11), is(false));
    }

    @Test
    public void whenFractionIsIrreducible() {
        assertThat(natural.irreducibleFraction(5, 17), is(true));
    }

    @Test
    public void whenNumberIsPrime() {
        assertThat(natural.isPrimeNatural(17), is(true));
    }

    @Test
    public void whenNumberIsNotPrime() {
        assertThat(natural.isPrimeNatural(132), is(false));
    }
}
