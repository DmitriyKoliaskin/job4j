package ru.job4j.calculate;

/**
 * Программа расчета идеального веса.
 */
public class Fit {
    /**
     * Иделаьный вес для мужчины.
     * @param height рост.
     * @return идеальный вес.
     */
    public  double manWeight(double height) {
        return (height - 100.0) * 1.15;
    }
    /**
     * Иделаьный вес для женщины.
     * @param height рост.
     * @return идеальный вес.
     */
    public  double womanWeight(double height) {
        return (height - 110.0) * 1.15;
    }
}