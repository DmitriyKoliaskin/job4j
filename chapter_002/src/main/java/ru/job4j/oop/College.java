package ru.job4j.oop;

/**
 *     понижающие привидение типов
 *     создание объекта класса Freshman
 *     приведение объекта класса Freshman к типу родительского класса StudentOne
 *     приведение объекта класса Freshman к типу родительского класса Object
 */
public class College {

    public static void main(String[] args) {
        Freshman freshman = new Freshman();
        StudentOne so = freshman;
        Object o = freshman;
    }
}
