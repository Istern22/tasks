package com.github.istern22.mezentsev;

import org.junit.Test;

import static com.github.istern22.mezentsev.Matrix.*;
import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void whenAverageOfPositiveMainDiagonal() {
        double[][] array = {{1, 0, 0}, {0, -1, 0}, {0, 0, 2}};
        assertThat(averageOfPositiveMainDiagonal(array), is(1.0));
    }

    @Test
    public void whenAverageOfNegativeSecondaryDiagonal() {
        double[][] array = {{1, 0, 0}, {0, -3, 0}, {0, 0, 2}};
        assertThat(averageOfNegativeSecondaryDiagonal(array), is(-1.0));
    }

    @Test
    public void whenDifferenceOfSumsOverAndUnderDiagonal() {
        double[][] array = {{1, 2, 3}, {0, 4, 5}, {6, 0, 0}};
        assertThat(differenceOfSumsOverAndUnderDiagonal(array), is(4.0));
    }

    @Test
    public void whenRowsOfNegativeSum() {
        double[][] array = {{1, 2, 3, -10}, {0, 4, 5, 0}, {-6, 0, 0, -6}};
        assertThat(rowsOfNegativeSum(array), is(2));
    }

    @Test
    public void whenMagicMatrix() {
        int[][] array = {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
        assertThat(magicMatrix(array), is(true));
    }

    @Test
    public void whenNoMagicMatrix() {
        int[][] array = {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 0, 1}};
        assertThat(magicMatrix(array), is(false));
    }

    @Test
    public void whenLatinMatrix() {
        int[][] array = {{16, 3, 2, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 0, 1}};
        assertThat(magicMatrix(array), is(false));
    }
}
