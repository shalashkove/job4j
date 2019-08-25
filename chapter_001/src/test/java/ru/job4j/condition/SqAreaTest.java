package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double out = SqArea.square(p, k);
        final double delta = 1e-6;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void square2() {
        int p = 4;
        int k = 1;
        double expected = 1;
        double out = SqArea.square(p, k);
        final double delta = 1e-6;
        Assert.assertEquals(expected, out, delta);
    }
}