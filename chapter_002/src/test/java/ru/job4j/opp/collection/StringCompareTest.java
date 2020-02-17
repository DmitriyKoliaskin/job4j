package ru.job4j.opp.collection;

import org.junit.Test;
import ru.job4j.oop.collection.StringCompare;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;
import static org.hamcrest.core.Is.is;

public class StringCompareTest {
    StringCompare compare = new StringCompare();
    public int comparison(String name1, String name2) {
        int rst = compare.compare(name1, name2);
        return rst;
    }

    @Test
    public void whenStringAreaEqualsThenZero() {
        assertThat(comparison(
                "Ivanov",
                "Ivanov"
        ), is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldBePositive() {
        assertThat(comparison(
                "Ivanov",
                "Ivanova"
        ), lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive() {
        assertThat(comparison(
                "Petrov",
                "Ivanova"
        ), greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive() {
        assertThat(comparison(
                "Petrov",
                "Patrov"
        ), greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative() {
        assertThat(comparison(
                "Patrova",
                "Petrov"
        ), lessThan(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative() {
        assertThat(comparison(
                "Ivanova",
                "Ivanov"
        ), greaterThan(0));
    }
}
