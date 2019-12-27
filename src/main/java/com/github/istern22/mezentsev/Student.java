package com.github.istern22.mezentsev;

import java.util.Arrays;

public class Student {

    private String name;
    private String surname;
    private String patronymic;
    private int birthYear;
    private String gender;
    private int[] grades;

    public Student(String name, String surname, String patronymic, int birthYear, String gender, int[] grades) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.gender = gender;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getGender() {
        return gender;
    }

    public int[] getGrades() {
        return grades;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        return this.toString().equals(((Student) o).toString());
    }

    public int hashCode() {
        return this.surname.hashCode();
    }

    @Override
    public String toString() {
        return name + " " + surname + " " + patronymic + " " + birthYear + " " + gender + " " + Arrays.toString(grades);
    }
}
