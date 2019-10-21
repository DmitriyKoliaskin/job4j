package ru.job4j.oop.pojo;

public class Book {
    private String name;
    private int page;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public Book(String name, int page) {
        this.name = name;
        this.page = page;


    }
}
