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
}
