package ru.job4j.oop.lambda;

public class Attachment {
    private String name;
    private int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "{" + "name='" + name + '\'' + ", size=" + size + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Attachment) {
            return obj != null && this.getName().equals(((Attachment) obj).getName());
        }
        return false;
    }
}
