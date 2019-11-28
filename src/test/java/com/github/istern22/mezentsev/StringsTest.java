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

    @Test
    public void whenDeleteMinWord() {
        assertThat(deleteMinWord("go code fast immediately"), is("code fast immediately"));
    }

    @Test
    public void whenDeleteMinWordTwo() {
        assertThat(deleteMinWord("go"), is(""));
    }

    @Test
    public void whenDeleteMinWordThree() {
        assertThat(deleteMinWord("fast go c o d e"), is("fast go o d e"));
    }

    @Test
    public void whenReplaceWord() {
        assertThat(replaceWord("go code fast immediately", "go", "fly"), is("fly code fast immediately"));
    }

    @Test
    public void whenReplaceWordTwo() {
        assertThat(replaceWord("go", "one", "two"), is("go"));
    }

    @Test
    public void whenReplaceWordThree() {
        assertThat(replaceWord("fast go c o d e", "fast", "don't"), is("don't go c o d e"));
    }

    @Test
    public void whenOneSpace() {
        assertThat(oneSpace("fast    go c  o d  e"), is("fast go c o d e"));
    }

    @Test
    public void whenReplaceMinMax() {
        assertThat(replaceMinMax("go code fast immediately"), is("immediately code fast go"));
    }

    @Test
    public void whenWordsOfLengthMoreNumber() {
        assertThat(wordsToLengthNumber("go code fast immediately", 4, true), is(1));
    }

    @Test
    public void whenWordsOfLengthMoreNumberTwo() {
        assertThat(wordsToLengthNumber("go code fast immediately", 1, true), is(4));
    }

    @Test
    public void whenWordsOfLengthLessNumberTwo() {
        assertThat(wordsToLengthNumber("go code fast immediately", 5, false), is(3));
    }

    @Test
    public void whenListOfWordsOfLengthMoreNumberTwo() {
        assertThat(listOfWordsToLengthNumber("go code fast immediately", 1, true), is("[go, code, fast, immediately]"));
    }

    @Test
    public void whenListOfWordsOfLengthLessNumberTwo() {
        assertThat(listOfWordsToLengthNumber("go code fast immediately", 5, false), is("[go, code, fast]"));
    }

    @Test
    public void whenNumberFirstCharEqualsLast() {
        assertThat(numberFirstCharEqualsLast("ogo codec fast immediateli"), is(3));
    }

    @Test
    public void whenWordsFirstCharEqualsLast() {
        assertThat(wordsFirstCharEqualsLast("ogo codec fast immediately"), is("[ogo, codec]"));
    }
}