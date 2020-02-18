package ru.job4j.opp.lambda;

import org.junit.Test;
import ru.job4j.oop.lambda.Calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class CalculatorTest {
    @Test
    public void whenAddOneUntilThree() {
        Calculator calc = new Calculator();
        List<Double> buffer = new ArrayList<>();
        calc.multiple(0, 3, 1, (value, index) -> (double) value + index, result -> buffer.add(result));
        assertThat(buffer, is(Arrays.asList(1D, 2D, 3D)));
    }
}
