package ru.job4j.list;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0, 0}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when9ElementsThen9() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
                3
        );
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertThat(result, is(expect));
    }

    @Test
    public void when0ElementsThen0() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(),
                0
        );
        int[][] expect = {};
        assertThat(result, is(expect));
    }

    @Test
    public void when6ElementsThen6() {
        ConvertList2Array list = new ConvertList2Array();
        List<Integer> result = list.convert(new ArrayList<>(List.of(
                new int[]{1, 2},
                new int[]{3, 4, 5, 6}
        )));
        List<Integer> expect = new ArrayList<>(List.of(
                1, 2, 3, 4, 5, 6
        ));
        assertThat(result, is(expect));
    }
}
