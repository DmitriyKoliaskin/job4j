package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int size) {
        this.load = size;
    }

    public void exchangge(Battery another) {
        this.load = this.load + another.load;
        another.load = 3;
    }

    public static void main(String[] args) {
        Battery first = new Battery(50);
        Battery second = new Battery(10);
        System.out.println("first : " + first.load + ". second : " + second.load);
        first.exchangge(second);
        System.out.println("first : " + first.load + ". second : " + second.load);
    }
}