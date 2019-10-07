package ru.job4j.oop;

public class Doctor extends Profession {

    private String speciality;

    public Doctor(String name, String surname, String educatioin, int birthday,int salary, String speciality) {
        super(name, surname, educatioin, birthday, salary);
        this.speciality = speciality;

    }

    public String getSpeciality() {
        return speciality;
    }

    public Diagnose heal(Patient patient) {
        Diagnose diagnose = new Diagnose();
        return diagnose;
    }
}
