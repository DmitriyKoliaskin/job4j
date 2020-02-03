package ru.job4j.opp.ex;

import org.junit.Test;
import ru.job4j.oop.ex.Fact;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenNLess1() {
        Fact.calc(0);
    }

    @Test
    public void whenNGreater0() {
        Fact.calc(1);
    }
}
