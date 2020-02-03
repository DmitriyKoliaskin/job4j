package ru.job4j.opp.pseudo;

import org.junit.Test;
import ru.job4j.oop.stragery.Triangle;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTestTwo {
    @Test
    public void trianglTest() {
        Triangle tri = new Triangle();
        assertThat(tri.draw(), is(new StringBuilder()
                .append("  *  /n")
                .append(" * * /n")
                .append("*****")
                .toString()));
    }
}