package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ItemSortTest {

    @Test
    public void whenItemSortByGrowth() {
        List<Item> result = new ArrayList<>(List.of(
                new Item("010", "One", "descOne"),
                new Item("005", "Two", "descFirstTwo"),
                new Item("005", "Two", "descAnotherTwo"),
                new Item("008", "Three", "descThree")
        ));
        Collections.sort(result, new SortByGrowth());
        List<Item> expected = new ArrayList<>(List.of(
                new Item("005", "Two", "descAnotherTwo"),
                new Item("005", "Two", "descFirstTwo"),
                new Item("008", "Three", "descThree"),
                new Item("010", "One", "descOne")
        ));
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenItemSortByDecrease() {
        List<Item> result = new ArrayList<>(List.of(
                new Item("010", "One", "descOne"),
                new Item("005", "Two", "descFirstTwo"),
                new Item("005", "Two", "descAnotherTwo"),
                new Item("008", "Three", "descThree")
        ));
        Collections.sort(result, new SortByDecrease());
        List<Item> expected = new ArrayList<>(List.of(
                new Item("010", "One", "descOne"),
                new Item("008", "Three", "descThree"),
                new Item("005", "Two", "descFirstTwo"),
                new Item("005", "Two", "descAnotherTwo")
        ));
        Assert.assertEquals(expected, result);
    }
}
