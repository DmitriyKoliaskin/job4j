package ru.job4j.oop;

public class Builder extends Engineer{

    private String task;

    public Builder(String name, String surname, String education, int birthday, int salary, String task) {
        super(name, surname, education, birthday, salary);
        this.task = task;
    }

    public Product develop(Project project) {
        Product house = new House();
        return house;
    }
}
