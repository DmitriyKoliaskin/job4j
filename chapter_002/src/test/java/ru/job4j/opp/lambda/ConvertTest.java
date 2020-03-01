package ru.job4j.opp.lambda;

import org.junit.Test;
import ru.job4j.oop.lambda.Convert;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertTest {
    Convert con = new Convert();
    Integer[][] numbers = new Integer[][] {
            {1, 2},
            {3, 4}
    };

    @Test
    public void whenConvertMatrixToList() {
        List<Integer> result = con.convertToList(numbers);
        List<Integer> expect = List.of(1, 2, 3, 4);
        assertThat(result, is(expect));
    }
}
