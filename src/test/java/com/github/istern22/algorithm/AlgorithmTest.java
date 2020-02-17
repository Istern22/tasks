package com.github.istern22.algorithm;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.junit.Assert.*;
import static  org.hamcrest.core.Is.is;

public class AlgorithmTest {

    Algorithm algorithm = new Algorithm();

    @Test
    public void searchBinary() {
        assertThat(algorithm.searchBinary(new int[] {1, 2, 3, 4, 6, 9, 10}, 3), is(2));
        assertThat(algorithm.searchBinary(new int[] {1, 2, 3, 4, 6, 9, 10}, 9), is(5));
        assertThat(algorithm.searchBinary(new int[] {1, 2, 3, 4, 6, 9, 10}, 20), is(-1));
    }
}