package ru.job4j.oop;

public class User {
    /**
     * Это поле объекта и доступно оно только конкретному объекту.
     */
    private String name;
    /**
     * И это поле объекта и доступно оно только конкретному объекту.
     */
    private int age;

    /**
     * canDrive является методом и значит что переменная can является локальной переменной этого метода.
     */
    public boolean canDrive() {
        boolean can = false;
        if (age >= 18) {
            can = true;
        }
        return can;
    }
}
