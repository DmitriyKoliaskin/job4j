package ru.job4j.condition;

/**
 * @author Dmitriy Koliaskin (Hipf02@yandex.ru)
 * @version 0.1
 */
public class Triangle {
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    /**
     * Получаем полупериметр треугольника.
     * @param a сторона.
     * @param b сторона.
     * @param c сторона.
     * @return полумериметр.
     */
    public double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    /**
     * Проверка для построения треугольника
     * @param a сторона.
     * @param c сторона.
     * @param b сторона.
     */
    private boolean exist(double a, double c, double b) {
        return (a < b + c) && (b < a + c) && (c < b + a);
    }

    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }
}