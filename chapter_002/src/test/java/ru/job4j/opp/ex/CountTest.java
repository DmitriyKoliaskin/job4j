package ru.job4j.opp.ex;

import org.junit.Test;
import ru.job4j.oop.ex.Count;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class CountTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenStratGreaterThenFinish() {
        Count.add(10, 2);
    }

    @Test()
    public void when2tothen3() {
        int rsl = Count.add(0, 3);
        assertThat(rsl, is(3));
    }
}
