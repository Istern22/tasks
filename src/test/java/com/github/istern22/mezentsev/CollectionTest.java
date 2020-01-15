package com.github.istern22.mezentsev;

import org.junit.Test;

import java.io.IOException;

import static com.github.istern22.mezentsev.Collection.*;
import static  org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionTest {

    public static ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(
            new Student("Ivan", "Ivanov", "Ivanovich", 1992, "man", new int[] {5, 5, 3}),
            new Student("Vasili", "Petrov", "Ivanovich", 1980, "man", new int[] {4, 5, 3, 2, 3}),
            new Student("Anna", "Ivanova", "Evgenevna", 1980, "woman", new int[] {3, 3, 3}),
            new Student("Kot", "Kotov", "Kotovich", 1985, "man", new int[] {5, 5, 5, 5}),
            new Student("Fox", "Foxov", "Foxovich", 1992, "man", new int[] {5, 5, 3}),
            new Student("Lambda", "Lambdova", "Lambdovna", 1998, "woman", new int[] {2, 5, 3, 2}),
            new Student("Mak", "Makov", "Makovich", 2000, "man", new int[] {5, 5, 3, 4}),
            new Student("Panda", "Pandov", "Pandovich", 1999, "man", new int[] {1, 5, 5, 3}),
            new Student("Krucha", "Kruchavna", "Kruchanovna", 1991, "woman", new int[] {1, 1, 5, 5, 3}),
            new Student("Bugor", "Bugorov", "Bugorovich", 2000, "man", new int[] {5, 5, 3, 3, 2}),
            new Student("Fix", "Fixova", "Fixovna", 2002, "woman", new int[] {1, 2, 3})
    ));

    @Test
    public void whenWriteIntoFile() throws IOException {
        write(students);
        assertThat(read(), is(students));
    }

    @Test
    public void whenOldStudentMan() throws IOException {
        assertThat(olderStudentMan(), is(List.of(
                new Student("Vasili", "Petrov", "Ivanovich", 1980, "man", new int[] {4, 5, 3, 2, 3})
        )));
    }

    @Test
    public void whenYoungStudentMan() throws IOException {
        assertThat(youngerStudentMan(), is(List.of(
                new Student("Mak", "Makov", "Makovich", 2000, "man", new int[] {5, 5, 3, 4}),
                new Student("Bugor", "Bugorov", "Bugorovich", 2000, "man", new int[] {5, 5, 3, 3, 2})
        )));
    }

    @Test
    public void whenOldStudentWoman() throws IOException {
        assertThat(olderStudentWoman(), is(List.of(
                new Student("Anna", "Ivanova", "Evgenevna", 1980, "woman", new int[] {3, 3, 3})
        )));
    }

    @Test
    public void whenYoungStudentWoman() throws IOException {
        assertThat(youngerStudentWoman(), is(List.of(
                new Student("Fix", "Fixova", "Fixovna", 2002, "woman", new int[] {1, 2, 3})
        )));
    }

    /**@Test
    public void whenMostSuccessfulStudentMan() throws IOException {
        assertThat(mostSuccessfulStudentMan(), is(List.of(
                new Student("Fix", "Fixova", "Fixovna", 2002, "woman", new int[] {1, 2, 3})
        )));
    }*/
}
