package ru.job4j.condition;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.experimental.categories.Categories;

import static org.junit.Assert.*;
import static org.hamcrest.number.IsCloseTo.closeTo;

public class TriangleTest {
    @Test
    public void whenAreaSetThreePointsThenTriangleArea() {
        Triangle triangle = new Triangle(new Point(0, 0), new Point(0, 2), new Point(2, 0));
        double result = triangle.area();
        double expected = 2D;
        assertThat(result, closeTo(expected, 0.1));
    }
}