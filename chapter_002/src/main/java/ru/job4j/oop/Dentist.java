package ru.job4j.oop;

public class Dentist extends Doctor {

    private boolean removeTooth;

    public Dentist(String name, String surname, String education, int birthday, int salary, String speciality) {
        super(name, surname, education, birthday, salary, speciality);
        this.removeTooth = removeTooth;
    }

    public boolean isRemoveTooth(Patient patient) {
        return removeTooth;
    }
}
