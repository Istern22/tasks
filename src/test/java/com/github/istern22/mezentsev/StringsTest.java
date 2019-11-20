package com.github.istern22.mezentsev;

import org.junit.Test;

import static com.github.istern22.mezentsev.Strings.*;
import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StringsTest {
    @Test
    public void whenMaxString() {
        assertThat(maxString("go code fast immediately"), is("immediately"));
    }

    @Test
    public void whenMaxStringTwo() {
        assertThat(maxString("go"), is("go"));
    }

    @Test
    public void whenMaxStringThree() {
        assertThat(maxString("fast go c o d e"), is("fast"));
    }

    @Test
    public void whenMinString() {
        assertThat(minString("go code fast immediately"), is("go"));
    }

    @Test
    public void whenMinStringTwo() {
        assertThat(minString("go"), is("go"));
    }

    @Test
    public void whenMinStringThree() {
        assertThat(minString("fast go c o d e"), is("c"));
    }

    @Test
    public void whenAverageWordLength() {
        assertThat(averageWordLength("go code fast immediately"), is(5.25));
    }

    @Test
    public void whenAverageWordLengthTwo() {
        assertThat(averageWordLength("go"), is(2.0));
    }

    @Test
    public void whenAverageWordLengthThree() {
        assertThat(averageWordLength("fast go c o d e"), is(1.6666666666666667));
    }

    @Test
    public void whenDeleteMaxWord() {
        assertThat(deleteMaxWord("go code fast immediately"), is("go code fast"));
    }

    @Test
    public void whenDeleteMaxWordTwo() {
        assertThat(deleteMaxWord("go"), is(""));
    }

    @Test
    public void whenDeleteMaxWordThree() {
        assertThat(deleteMaxWord("fast go c o d e"), is("go c o d e"));
    }
}
