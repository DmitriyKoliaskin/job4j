package ru.job4j.calculate;

/**
 * Easy calculator
 * @author Dmitriy Koliaskin (Hipf02@yandex.ru)
 */

public class Calculator {
    /**
     * @param first value
     * @param second value
     * @return first plus second
     */
    public double add(double first, double second) {
        return first + second;
    }
    /**
     * @param first value
     * @param second value
     * @return first minus second
     */
    public double subtract(double first, double second){
        return first - second;
    }
    /**
     * @param first value
     * @param second value
     * @return first div second
     */
    public double div(double first, double second){
        return first / second;
    }
    /**
     * @param first value
     * @param second value
     * @return first multiply second
     */
    public double multiply(double first, double second){
        return first * second;
    }
}
