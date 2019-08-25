package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void manWeight() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 3;
        int y2 = 4;
        double expected = 5;
        double out = Point.distance(x1, y1, x2, y2);
        final double delta = 1e-6;
        Assert.assertEquals(expected, out, delta);
    }

    @Test
    public void manWeight2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 2;
        double expected = 2.828427;
        double out = Point.distance(x1, y1, x2, y2);
        final double delta = 1e-6;
        Assert.assertEquals(expected, out, delta);
    }

}
