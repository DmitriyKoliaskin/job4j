package ru.job4j.opp.pseudo;

import org.junit.Test;
import ru.job4j.oop.stragery.Square;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class SquareTest {
    @Test
    public void squareTesting() {
        Square square = new Square();
        assertThat(square.draw(), is(new StringBuilder()
                .append("+ + + +/n")
                .append("+     +/n")
                .append("+     +/n")
                .append("+ + + +")
                .toString()));
    }
}