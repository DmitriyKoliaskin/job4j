package ru.job4j.oop.lambda;

import java.util.Objects;

public class Student implements Comparable<Student> {
    private int score;
    private String surname;

    public String getSurname() {
        return surname;
    }


    public Student(int score) {
        this.score = score;
    }

    public Student(String surname, int score) {
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
        return Objects.equals(student.getScore(), getScore()) || Objects.equals(student.getSurname(), getSurname());
    }

/*    @Override
    public int hashCode() {
        return Objects.hash(getSurname(), getScore());
    }*/

    @Override
    public int compareTo(Student student) {
        return 0;
    }
}
