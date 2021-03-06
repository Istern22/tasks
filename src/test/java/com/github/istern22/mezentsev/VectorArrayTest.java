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
        assertThat(positiveSubSequence(new double[] {1, -1, 3, -10, 8, 7, -50}), is(new ArrayList(Arrays.asList(8.0, 7.0))));
    }

    @Test
    public void whenSubSequencePositiveTwo() {
        assertThat(positiveSubSequence(new double[] {8, 7}), is(new ArrayList(Arrays.asList(8.0, 7.0))));
    }

    @Test
    public void whenSubSequencePositiveThree() {
        assertThat(positiveSubSequence(new double[] {-8, -7}), is(new ArrayList(Arrays.asList())));
    }

    @Test
    public void whenTreeDuplicates() {
        assertThat(duplicates(new double[] {-8, -7, -8, -8, -7}), is(new ArrayList(Arrays.asList(-8.0, -7.0))));
    }

    @Test
    public void whenNoDuplicates() {
        assertThat(duplicates(new double[] {-8, -7, 0, 5, 8}), is(new ArrayList(Arrays.asList())));
    }

    @Test
    public void whenTwoDuplicates() {
        assertThat(duplicates(new double[] {8, 8, 0, 5, 8, 0}), is(new ArrayList(Arrays.asList(8.0, 0.0))));
    }

    @Test
    public void whenNumbersOfAverages() {
        assertThat(numbersBelowAverage(8, new double[] {8, 8, 8}), is(3));
    }

    @Test
    public void whenNumbersOfAveragesTwo() {
        assertThat(numbersBelowAverage(1, new double[] {0, 1, 2}), is(2));
    }

    @Test
    public void whenNonDecreasingCheck() {
        assertThat(nonDecreasingCheck(new int[] {0, 1, 2, 4, 4}), is(true));
    }

    @Test
    public void whenNonDecreasingCheckTwo() {
        assertThat(nonDecreasingCheck(new int[] {0, 1, 2, 4, 4, 3}), is(false));
    }

    @Test
    public void whenDecreasingCheck() {
        assertThat(decreasingCheck(new int[] {4, 3, 2, 1, 1}), is(false));
    }

    @Test
    public void whenDecreasingCheckTwo() {
        assertThat(decreasingCheck(new int[] {4, 2, 0}), is(true));
    }

    @Test
    public void whenIndexOfArray() {
        assertThat(indexOfArray(new int[] {0, 1, 2, 4, 4}, 4), is(2));
    }

    @Test
    public void whenIndexOfArrayTwo() {
        assertThat(indexOfArray(new int[] {4, 20, 30}, 25), is(1));
    }

    @Test
    public void whenIntFromGap() {
        assertThat(intFromGap(new int[] {0, 1, 2, 4, 4}, 4, 10), is(2));
    }

    @Test
    public void whenIntFromGapTwo() {
        assertThat(intFromGap(new int[] {4, 20, 30}, 1, 5), is(1));
    }

    @Test
    public void whenShift() {
        assertThat(shift(new int[] {0, 1, 2, 3}, 2), is(new int[] {2, 3, 0, 1}));
    }

    @Test
    public void whenShiftTwo() {
        assertThat(shift(new int[] {0, 5, 10, 15, 20}, 4), is(new int[] {5, 10, 15, 20, 0}));
    }

    @Test
    public void whenWhatIsGreater() {
        assertThat(whatIsGreater(new int[] {0, 1, 2, -3}), is(3));
    }

    @Test
    public void whenWhatIsGreaterTwo() {
        assertThat(whatIsGreater(new int[] {0, 5, -10, -15, 20}), is(20));
    }
}