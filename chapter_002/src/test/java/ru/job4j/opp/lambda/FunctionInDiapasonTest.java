package ru.job4j.opp.lambda;
import org.junit.Test;
import ru.job4j.oop.lambda.FunctionInDiapason;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FunctionInDiapasonTest {

    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionInDiapason function = new FunctionInDiapason();
        List<Double> result = function.diapason(3, 6, x -> 2 * x + 1);
        List<Double> expected = List.of(7D, 9D, 11D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunction() {
        FunctionInDiapason function = new FunctionInDiapason();
        List<Double> result = function.diapason(3, 6, x -> Math.pow(x, 2));
        List<Double> expected = List.of(9D, 16D, 25D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunction() {
        FunctionInDiapason function = new FunctionInDiapason();
        List<Double> result = function.diapason(3, 6, x -> Math.log10(x));
        double[] expected = {0.477, 0.602, 0.698};
        double[] resultArray = new double[result.size()];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }
        assertArrayEquals(expected, resultArray, 0.001);
    }
}
