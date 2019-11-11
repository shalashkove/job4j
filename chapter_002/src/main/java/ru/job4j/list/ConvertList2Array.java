package ru.job4j.list;

import java.util.List;

public class ConvertList2Array {
    public int[][] toArray(List<Integer> list, int rows) {
        int cells = (int) Math.ceil((double) list.size() / rows);
        int[][] array = new int[rows][cells];
        int index = 0;
        for (Integer var : list) {
            array[index / rows][index % rows] = var;
            index++;
        }
        return array;
    }
}