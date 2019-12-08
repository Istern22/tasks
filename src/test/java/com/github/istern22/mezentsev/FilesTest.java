package com.github.istern22.mezentsev;

import org.junit.Test;

import java.io.IOException;

import static com.github.istern22.mezentsev.Files.*;
import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FilesTest {

    @Test
    public void whenWrite() throws IOException {
        write(new int[] {1, 2, 3});
        assertThat(read(), is(new int[] {1, 2, 3}));
    }

    @Test
    public void whenSum() throws IOException {
        sum(new int[] {1, 3, 5});
        assertThat(readInt(), is(9));
    }

    @Test
    public void whenMax() throws IOException {
        max(new int[] {1, 3, 5});
        assertThat(readInt(), is(5));
    }

    @Test
    public void whenMin() throws IOException {
        min(new int[] {1, 3, 5});
        assertThat(readInt(), is(1));
    }

    @Test
    public void whenSumPositive() throws IOException {
        sumPositive(new int[] {1, -3, 5});
        assertThat(readInt(), is(6));
    }

    @Test
    public void whenSumNegative() throws IOException {
        sumNegative(new int[] {-1, -3, 5});
        assertThat(readInt(), is(-4));
    }

    @Test
    public void whenMaxPositive() throws IOException {
        maxPositive(new int[] {1, -3, 5});
        assertThat(readInt(), is(5));
    }

    @Test
    public void whenMaxNegative() throws IOException {
        maxNegative(new int[] {-1, -3, 5});
        assertThat(readInt(), is(-1));
    }

    @Test
    public void whenMinPositive() throws IOException {
        minPositive(new int[] {1, -3, 5});
        assertThat(readInt(), is(1));
    }

    @Test
    public void whenMinNegative() throws IOException {
        minNegative(new int[] {-1, -3, 5});
        assertThat(readInt(), is(-3));
    }

    @Test
    public void whenNumbersOfRange() throws IOException {
        numbersOfRange(new int[] {-1, -3, 5}, -2, 6);
        assertThat(readInt(), is(2));
    }

    @Test
    public void whenNumbersNotOfRange() throws IOException {
        numbersNotOfRange(new int[] {-1, -3, 5}, -2, 6);
        assertThat(readInt(), is(1));
    }

    @Test
    public void whenRangeOfAllNumbers() throws IOException {
        rangeOfAllNumbers(new int[] {-1, -3, 5});
        assertThat(read(), is(new int[] {-3, 5}));
    }

    @Test
    public void whenAverageOfPositive() throws IOException {
        averageOfPositive(new int[] {-1, 3, 5});
        assertThat(readDouble(), is(4.0));
    }
}
