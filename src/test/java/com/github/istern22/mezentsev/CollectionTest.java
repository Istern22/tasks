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

   /** @Test
    public void whenYoungStudentWoman() throws IOException {
        assertThat(youngerStudentWoman(), is(List.of(
                new Student("Fix", "Fixova", "Fixovna", 2002, "woman", new int[] {1, 2, 3})
        )));
    }*/

    @Test
    public void whenMostSuccessfulStudentMan() throws IOException {
        assertThat(mostSuccessfulStudentMan(), is(
                new Student("Kot", "Kotov", "Kotovich", 1985, "man", new int[] {5, 5, 5, 5})
        ));
    }

    @Test
    public void whenMostUnsuccessfulStudentMan() throws IOException {
        assertThat(mostUnsuccessfulStudentMan(), is(
                new Student("Vasili", "Petrov", "Ivanovich", 1980, "man", new int[] {4, 5, 3, 2, 3})
        ));
    }

    @Test
    public void whenMostSuccessfulStudentWoman() throws IOException {
        assertThat(mostSuccessfulStudentWoman(), is(
                new Student("Krucha", "Kruchavna", "Kruchanovna", 1991, "woman", new int[] {1, 1, 5, 5, 3})
        ));
    }

    @Test
    public void whenMostUnsuccessfulStudentWoman() throws IOException {
        assertThat(mostUnsuccessfulStudentWoman(), is(
                new Student("Fix", "Fixova", "Fixovna", 2002, "woman", new int[] {1, 2, 3})
        ));
    }

    @Test
    public void whenScholarshipWoman() throws IOException {
        assertThat(scholarshipWoman(), is(new ArrayList<Student>()));
    }

    @Test
    public void whenNoScholarshipWoman() throws IOException {
        assertThat(noScholarshipWoman(), is(List.of(
                new Student("Anna", "Ivanova", "Evgenevna", 1980, "woman", new int[] {3, 3, 3}),
                new Student("Lambda", "Lambdova", "Lambdovna", 1998, "woman", new int[] {2, 5, 3, 2}),
                new Student("Krucha", "Kruchavna", "Kruchanovna", 1991, "woman", new int[] {1, 1, 5, 5, 3}),
                new Student("Fix", "Fixova", "Fixovna", 2002, "woman", new int[] {1, 2, 3})
        )));
    }

    @Test
    public void whenScholarshipMan() throws IOException {
        assertThat(scholarshipMan(), is(List.of(
                new Student("Kot", "Kotov", "Kotovich", 1985, "man", new int[] {5, 5, 5, 5})
        )));
    }

    @Test
    public void whenNoScholarshipMan() throws IOException {
        assertThat(noScholarshipMan(), is(List.of(
                new Student("Ivan", "Ivanov", "Ivanovich", 1992, "man", new int[] {5, 5, 3}),
                new Student("Vasili", "Petrov", "Ivanovich", 1980, "man", new int[] {4, 5, 3, 2, 3}),
                new Student("Fox", "Foxov", "Foxovich", 1992, "man", new int[] {5, 5, 3}),
                new Student("Mak", "Makov", "Makovich", 2000, "man", new int[] {5, 5, 3, 4}),
                new Student("Panda", "Pandov", "Pandovich", 1999, "man", new int[] {1, 5, 5, 3}),
                new Student("Bugor", "Bugorov", "Bugorovich", 2000, "man", new int[] {5, 5, 3, 3, 2})
        )));
    }

    @Test
    public void whenExcellentStudent() throws IOException {
        assertThat(excellentStudent(), is(List.of(
                new Student("Kot", "Kotov", "Kotovich", 1985, "man", new int[]{5, 5, 5, 5})
        )));
    }
}
