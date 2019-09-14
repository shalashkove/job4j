package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        int result = max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax3To2Then3() {
        Max max = new Max();
        int result = max.max(3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax3To8Then8() {
        Max max = new Max();
        int result = max.max(3, 8);
        assertThat(result, is(8));
    }

    @Test
    public void whenMax4To4Then4() {
        Max max = new Max();
        int result = max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax213Then3() {
        Max max = new Max();
        int result = max.max(2, 1, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax531Then5() {
        Max max = new Max();
        int result = max.max(5, 3, 1);
        assertThat(result, is(5));
    }

    @Test
    public void whenMax111Then1() {
        Max max = new Max();
        int result = max.max(1, 1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax1234Then4() {
        Max max = new Max();
        int result = max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax4321Then4() {
        Max max = new Max();
        int result = max.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1432Then4() {
        Max max = new Max();
        int result = max.max(1, 4, 3, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1243Then4() {
        Max max = new Max();
        int result = max.max(1, 2, 4, 3);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1111Then1() {
        Max max = new Max();
        int result = max.max(1, 1, 1, 1);
        assertThat(result, is(1));
    }
}
