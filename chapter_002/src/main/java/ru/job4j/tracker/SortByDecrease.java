package ru.job4j.tracker;

import java.util.Comparator;

public class SortByDecrease implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        int result = second.getId().compareTo(first.getId());
        if (result == 0) {
            result = second.getName().compareTo(first.getName());
        }
        if (result == 0) {
            result = second.getDesc().compareTo(first.getDesc());
        }
        return result;
    }
}
