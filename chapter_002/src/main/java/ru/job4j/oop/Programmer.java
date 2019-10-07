package ru.job4j.oop;

public class Programmer extends Engineer {

    private String languages;

    public Programmer(String name, String surname, String education, int birthday, int salary) {
        super(name, surname, education, birthday, salary);
        this.languages = languages;
    }

    public String getLanguages() {
        return languages;
    }

    public Resolution google(Problem problem) {
        Resolution resolution = new Resolution();
        return resolution;
    }

    public Product develop(Project project) {
        Product program = new Program();
        return program;
    }
}
