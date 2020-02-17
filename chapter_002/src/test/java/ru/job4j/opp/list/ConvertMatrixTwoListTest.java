package ru.job4j.opp.list;

import org.junit.Test;
import ru.job4j.oop.list.ConvertMatrixTwoList;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrixTwoListTest {
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrixTwoList list = new ConvertMatrixTwoList();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = Arrays.asList(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}
