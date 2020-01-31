package ru.job4j.oop.poly;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Let's go!");
    }

    @Override
    public void passengers(int passengers) {
        System.out.println("On our Board " + passengers + " passengers.");
    }

    @Override
    public double refuel(double fuel) {
        int sum = 1000;
        return sum / fuel;
    }
}
