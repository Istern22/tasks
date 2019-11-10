package com.github.istern22.mezentsev;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.BaseStream;

import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class NaturalTest {
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
    public void whenNoDividers() {
        assertThat(natural.dividers(6), is(new ArrayList<Integer>(Arrays.asList(2, 3))));
    }
}
