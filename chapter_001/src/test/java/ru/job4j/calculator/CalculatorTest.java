package ru.job4j.calculator;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;


import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        Calculator function = new Calculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        Calculator function = new Calculator();
        List<Double> result = function.diapason(5, 8, x -> x * x + 2 * x + 1);
        List<Double> expected = Arrays.asList(36D, 49D, 64D);
        assertThat(result, is(expected));
    }

    @Test
    public void whenLogarithmicFunctionThenLogarithmicResults() {
        final double DELTA = 0.0001;
        Calculator function = new Calculator();
        List<Double> result = function.diapason(5, 8, x -> Math.log(x) + 1);
        List<Double> expected = Arrays.asList(2.6094D, 2.7917D, 2.9459D);
        for (int index = 0; index != result.size(); index++) {
            assertEquals(expected.get(index), result.get(index), DELTA);
        }
    }



}
