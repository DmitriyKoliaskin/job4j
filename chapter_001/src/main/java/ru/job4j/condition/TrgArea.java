package ru.job4j.condition;

/**
 * @author Dmitriy Koliaskin (dmk2098@gmail.com)
 * @version 0.1
 */
public class TrgArea {
    /**
     * @param a сторонаю.
     * @param b сторона.
     * @param c сторона.
     * @return площадь треугольника
     */
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
