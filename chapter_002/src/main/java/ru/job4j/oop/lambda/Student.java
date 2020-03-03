package ru.job4j.oop.lambda;

import java.util.Objects;
import java.util.Set;

public class Student implements Comparable<Student> {
    private int score;
    private String surname, section;
    private Set<String> units;

    public Student(int score) {
        this.score = score;
    }

    public Student(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }

    public Student(String section, String surname) {
        this.section = section;
        this.surname = surname;
    }

    public Student(String surname, Set<String> units) {
        this.surname = surname;
        this.units = units;
    }

    public String getSection() {
        return section;
    }

    public String getSurname() {
        return surname;
    }

    public int getScore() {
        return score;
    }

    public Set<String> getUnits() {
        return units;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Student student = (Student) obj;
        return Objects.equals(student.getScore(), getScore()) || Objects.equals(student.getSurname(), getSurname());
    }

    @Override
    public int compareTo(Student student) {
        return 0;
    }
}
