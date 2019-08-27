package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SqMaxTest {
    @Test
    public void whenMaxFirst() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(5, 2, 3, 4);
        assertThat(result, is(5));
    }

    @Test
    public void whenMaxSecond() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(1, 7, 3, 4);
        assertThat(result, is(7));
    }

    @Test
    public void whenMaxThird() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(1, 2, 6, 4);
        assertThat(result, is(6));
    }

    @Test
    public void whenMaxForth() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMaxAllEqual() {
        SqMax sqMax = new SqMax();
        int result = sqMax.max(2, 2, 2, 2);
        assertThat(result, is(2));
    }
}