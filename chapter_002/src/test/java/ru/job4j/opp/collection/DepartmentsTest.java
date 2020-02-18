package ru.job4j.opp.collection;

import org.junit.Test;
import ru.job4j.oop.collection.Departments;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {
    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("K1/SK1");
        List<String> expect = Arrays.asList("K1", "K1/SK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenNonChance() {
        List<String> input = Arrays.asList("K1", "K1/SK1");
        List<String> expect = Arrays.asList("K1", "K1/SK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenTwoDepart() {
        List<String> input = Arrays.asList("K1/SK1/SSK1", "K2/SK1/SSK1");
        List<String> expect = Arrays.asList("K1", "K1/SK1", "K1/SK1/SSK1", "K2", "K2/SK1", "K2/SK1/SSK1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expect));
    }

    @Test
    public void whenTwoDepartReverse() {
        List<String> input = Arrays.asList("K1/SK1/SSK1", "K2/SK1/SSK1");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        List<String> expect = Arrays.asList("K2", "K2/SK1", "K2/SK1/SSK1", "K1", "K1/SK1", "K1/SK1/SSK1");
        assertThat(result, is(expect));
    }

    @Test
    public void whenSortReverse() {
        List<String> input = Arrays.asList("K2/SK1", "K2");
        List<String> result = Departments.fillGaps(input);
        Departments.sortDesc(result);
        List<String> expect = Arrays.asList("K2", "K2/SK1");
        assertThat(result, is(expect));
    }
}
