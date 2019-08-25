package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void manWeight() {
        double in = 200;
        double expected = 115;
        double out = Fit.manWeight(in);
        final double delta = 1e-6;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void womanWeight() {
        double in = 170;
        double expected = 69;
        double out = Fit.womanWeight(in);
        final double delta = 1e-6;
        Assert.assertEquals(expected, out, delta);
    }
}
