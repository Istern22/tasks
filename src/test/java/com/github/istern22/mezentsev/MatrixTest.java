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
        int[][] array = {{1, 2, 3}, {2, 3, 1}, {3, 1, 2}};
        assertThat(latinMatrix(array), is(true));
    }

    @Test
    public void whenNoLatinMatrix() {
        int[][] array = {{1, 2, 3}, {2, 3, 1}, {3, 1, 1}};
        assertThat(latinMatrix(array), is(false));
    }

    @Test
    public void whenMinUnderMainDiagonal() {
        int[][] array = {{5, 6, 7}, {2, 3, 1}, {3, 1, 1}};
        assertThat(minUnderMainDiagonal(array), is(1));
    }

    @Test
    public void whenMinAboveMainDiagonal() {
        int[][] array = {{5, 6, 7}, {2, 3, 2}, {3, 1, 1}};
        assertThat(minAboveMainDiagonal(array), is(2));
    }

    @Test
    public void whenMaxnUnderMainDiagonal() {
        int[][] array = {{5, 6, 7}, {2, 3, 1}, {3, 1, 1}};
        assertThat(maxUnderMainDiagonal(array), is(3));
    }

    @Test
    public void whenMaxAboveMainDiagonal() {
        int[][] array = {{5, 6, 7}, {2, 3, 2}, {3, 1, 1}};
        assertThat(maxAboveMainDiagonal(array), is(7));
    }

    @Test
    public void whenMinAboveMainAndSideDiagonal() {
        int[][] array = {{16, 3, 1, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 0, 1}};
        assertThat(minAboveMainAndSideDiagonal(array), is(1));
    }

    @Test
    public void whenMinAboveMainAndUnderSideDiagonal() {
        int[][] array = {{16, 3, 1, 13}, {5, 10, 11, 8}, {9, 6, 7, 12}, {4, 15, 0, 1}};
        assertThat(minAboveMainAndUnderSideDiagonal(array), is(8));
    }
}
