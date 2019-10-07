package ru.job4j.oop;

public class Engineer extends Profession {
    public Engineer(String name, String surname, String education, int birthday, int salary) {
        super(name, surname, education, birthday, salary);
    }

    public Product develop(Project project) {
        Product product = new Product();
        return product;
    }
}