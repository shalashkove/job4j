package ru.job4j.list;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertMatrix2ListTest {
    @Test
    public void when2on2ArrayThenList4() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4}
        };
        List<Integer> expect = List.of(
                1, 2, 3, 4
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }

    @Test
    public void when3on2ArrayThenList6() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {
                {1, 2},
                {3, 4},
                {5, 6}
        };
        List<Integer> expect = List.of(
                1, 2, 3, 4, 5, 6
        );
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }

    @Test
    public void when0ArrayThenList0() {
        ConvertMatrix2List list = new ConvertMatrix2List();
        int[][] input = {};
        List<Integer> expect = Arrays.asList();
        List<Integer> result = list.toList(input);
        assertThat(result, is(expect));
    }
}
