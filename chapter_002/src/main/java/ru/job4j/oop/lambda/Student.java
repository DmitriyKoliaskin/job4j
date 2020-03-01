package ru.job4j.oop.lambda;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int score;

    public String getSurname() {
        return surname;
    }

    private String surname;

    public Student(int score) {
        this.score = score;
    }

    public Student(int score, String surname) {
        this.score = score;
        this.surname = surname;
    }

    public int getScore() {
        return score;
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
        return score == student.score;
    }

    @Override
    public int hashCode() {
        return Objects.hash(score);
    }

    @Override
    public int compareTo(Student student) {
        return Integer.compare(score, student.score);
    }
}
