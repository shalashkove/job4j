package ru.job4j.tracker;

import java.util.Comparator;

public class SortByGrowth implements Comparator<Item> {
    @Override
    public int compare(Item first, Item second) {
        int result = first.getId().compareTo(second.getId());
        if (result == 0) {
            result = first.getName().compareTo(second.getName());
        }
        if (result == 0) {
            result = first.getDesc().compareTo(second.getDesc());
        }
        return result;
    }
}
