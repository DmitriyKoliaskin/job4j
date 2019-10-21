package ru.job4j.oop.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Караськин Карась Карасевич");
        student.setGroup("ФФК 51-зо");
        student.setReceipts(new Date());

        System.out.println(student.getFio() + ", группа " + student.getGroup() + ", поступил: " + student.getReceipts());
    }
}
