package ru.job4j.oop;

public class Surgeon extends Doctor {
    public Surgeon(String name, String surname, String education, int birthday, int salary, String speciality) {
        super(name, surname, education, birthday, salary, speciality);
    }

    public Patient doSurgery(Patient patient) {
        return patient;
    }
}
