package com.github.istern22.mezentsev;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getBirthYear(), o2.getBirthYear());
    }
}