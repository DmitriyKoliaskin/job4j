package ru.job4j.condition;

public class SqArea {
    public int square(int p, int k) {
        int h = (int) Math.sqrt(p / (2 * k));
        int w = h * k;
        return h * w;
    }
}
