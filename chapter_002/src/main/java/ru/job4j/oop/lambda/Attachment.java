package ru.job4j.oop.lambda;

import java.util.Objects;

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
    @Override
    public int hashCode() {
        return Objects.hash(name, size);
    }
}
