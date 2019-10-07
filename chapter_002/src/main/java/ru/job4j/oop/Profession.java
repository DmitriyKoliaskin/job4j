package ru.job4j.oop;

public class Profession {

    public String name;

    public String surname;

    public String education;

    public int birthday;

    public int salary;

    public Profession(String name, String surname, String education, int birthday, int salary) {
        super();
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEducation() {
        return education;
    }

    public int getBirthday() {
        return birthday;
    }

    public int getSalary() {
        return salary;
    }
}
