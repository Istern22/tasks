package com.github.istern22.mezentsev;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VectorArrayTest {

    VectorArray vectorArray = new VectorArray();

    @Test
    public void whenPrimeArrayIncrease() {
        assertThat(vectorArray.increasingPrimeArray(new int[] {3, 5}), is(true));
    }

    @Test
    public void whenPrimeArrayNotIncrease() {
        assertThat(vectorArray.increasingPrimeArray(new int[] {3, 5, 7, 11, 2}), is(false));
    }

    @Test
    public void whenNotPrime() {
        assertThat(vectorArray.increasingPrimeArray(new int[] {3, 5, 8, 11}), is(false));
    }
}
