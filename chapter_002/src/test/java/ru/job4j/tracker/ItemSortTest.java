package ru.job4j.tracker;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class ItemSortTest {

    @Test
    public void whenItemSortByGrowth() {
        Item item1 = new Item("010", "One", "descOne");
        Item item2 = new Item("005", "Two", "descFirstTwo");
        Item item3 = new Item("005", "Two", "descAnotherTwo");
        Item item4 = new Item("008", "Three", "descThree");
        List<Item> result = new ArrayList<>();
        result.add(item1);
        result.add(item2);
        result.add(item3);
        result.add(item4);
        Collections.sort(result, new SortByGrowth());
        List<Item> expected = new ArrayList<>();
        expected.add(item3);
        expected.add(item2);
        expected.add(item4);
        expected.add(item1);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenItemSortByDecrease() {
        Item item1 = new Item("010", "One", "descOne");
        Item item2 = new Item("005", "Two", "descFirstTwo");
        Item item3 = new Item("005", "Two", "descAnotherTwo");
        Item item4 = new Item("008", "Three", "descThree");
        List<Item> result = new ArrayList<>();
        result.add(item1);
        result.add(item2);
        result.add(item3);
        result.add(item4);
        Collections.sort(result, new SortByDecrease());
        List<Item> expected = new ArrayList<>();
        expected.add(item1);
        expected.add(item4);
        expected.add(item2);
        expected.add(item3);
        Assert.assertEquals(expected, result);
    }
}
