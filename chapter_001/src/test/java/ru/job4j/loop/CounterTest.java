package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CounterTest {
    @Test
    public void when1to10Then30() {
        Counter counter = new Counter();
        int result = counter.add(1, 10);
        assertThat(result, is(30));
    }

    @Test
    public void when10to1Then30() {
        Counter counter = new Counter();
        int result = counter.add(10, 1);
        assertThat(result, is(30));
    }

    @Test
    public void when1to1Then0() {
        Counter counter = new Counter();
        int result = counter.add(1, 1);
        assertThat(result, is(0));
    }

    @Test
    public void when2to2Then2() {
        Counter counter = new Counter();
        int result = counter.add(2, 2);
        assertThat(result, is(2));
    }
}

