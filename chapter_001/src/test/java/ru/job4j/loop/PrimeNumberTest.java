package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class PrimeNumberTest {
    @Test
    public void when5() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(5);
        assertThat(count, is(3));
    }

    @Test
    public void when17() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(17);
        assertThat(count, is(7));
    }

    @Test
    public void when1() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(1);
        assertThat(count, is(0));
    }

    @Test
    public void when0() {
        PrimeNumber prime = new PrimeNumber();
        int count = prime.calc(0);
        assertThat(count, is(0));
    }
}