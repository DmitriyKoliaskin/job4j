package ru.job4j.oop.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("Petr");
        al.add("Ivan");
        al.add("Stepan");
        for (String value : al) {
            System.out.println(value);
        }
    }
}
