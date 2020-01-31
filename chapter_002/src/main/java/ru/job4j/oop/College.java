package ru.job4j.oop;

public class College {
    //понижающие привидение типов
    public static void main(String[] args) {
        //создание объекта класса Freshman
        Freshman freshman = new Freshman();
        //приведение объекта класса Freshman
        //к типу родительского класса StudentOne
        StudentOne so = freshman;
        //приведение объекта класса Freshman
        //к типу родительского класса Object
        Object o = freshman;
    }
}
