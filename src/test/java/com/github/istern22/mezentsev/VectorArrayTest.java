package com.github.istern22.mezentsev;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static com.github.istern22.mezentsev.VectorArray.*;
import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class VectorArrayTest {

    @Test
    public void whenPrimeArrayIncrease() {
        assertThat(increasingPrimeArray(new int[] {3, 5}), is(true));
    }

    @Test
    public void whenPrimeArrayNotIncrease() {
        assertThat(increasingPrimeArray(new int[] {3, 5, 7, 11, 2}), is(false));
    }

    @Test
    public void whenNotPrime() {
        assertThat(increasingPrimeArray(new int[] {3, 5, 8, 11}), is(false));
    }

    @Test
    public void whenMultiplyAveragesOne() {
        assertThat(multiplyAverages(new double[] {3, 5, -8, 10}), is(-48.0));
    }

    @Test
    public void whenMultiplyAveragesTwo() {
        assertThat(multiplyAverages(new double[] {0, -6, -8, 10}), is(-35.0));
    }

    @Test
    public void whenMultiplySums() {
        assertThat(multiplyOfSums(new double[] {0, -6, -8, 10}), is(-32.0));
    }

    @Test
    public void whenMultiplySumsTwo() {
        assertThat(multiplyOfSums(new double[] {0, -6, 0, 10}), is(0.0));
    }

    @Test
    public void whenAverageWithoutDuplicates() {
        assertThat(averageWithoutDuplicates(new double[] {1, 3, 5, 3, 6, 3, 0}), is(3.0));
    }

    @Test
    public void whenAverageWithoutDuplicatesTwo() {
        assertThat(averageWithoutDuplicates(new double[] {1, 3, 1, 3, 1, 3}), is(2.0));
    }

    @Test
    public void whenFindIntegersBetweenMinAndMax() {
        assertThat(numbersFromInterval(new int[] {1, 3}), is(new ArrayList<Integer>(Arrays.asList(2))));
    }

    @Test
    public void whenFindIntegersBetweenMinAndMaxTwo() {
        assertThat(numbersFromInterval(new int[] {1, 0, 3, 10, 8, 7}), is(new ArrayList<Integer>(Arrays.asList(2, 4, 5, 6, 9))));
    }

    @Test
    public void whenNotSubSequence() {
        assertThat(subSequence(new int[] {1, 0, 3, 10, 8, 7}, new int[] {3, 0}), is(false));
    }

    @Test
    public void whenSubSequence() {
        assertThat(subSequence(new int[] {1, 0, 3, 10, 8, 7}, new int[] {3, 10}), is(true));
    }

    @Test
    public void whenSubSequenceTwo() {
        assertThat(subSequence(new int[] {1, 0, 3, 10, 8, 7}, new int[] {3}), is(true));
    }

    @Test
    public void whenSubSequenceThree() {
        assertThat(subSequence(new int[] {1, 0, 3, 10, 8, 7}, new int[] {1, 0, 3, 10, 8, 7}), is(true));
    }

    @Test
    public void whenSubSequencePositiveOne() {
        assertThat(positiveSubSequence(new double[] {1, -1, 3, -10, 8, 7}), is(new ArrayList(Arrays.asList())));
    }
 }
