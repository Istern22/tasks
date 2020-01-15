package com.github.istern22.mezentsev;

import java.util.Arrays;

public class Student {

    private String name;
    private String surname;
    private String patronymic;
    private Integer birthYear;
    private String gender;
    private int[] grades;

    public Student(String name, String surname, String patronymic, Integer birthYear, String gender, int[] grades) {
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

    public Integer getBirthYear() {
        return birthYear;
    }

    public String getGender() {
        return gender;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
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
