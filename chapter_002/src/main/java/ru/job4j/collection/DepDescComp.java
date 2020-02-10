package ru.job4j.collection;

import java.util.*;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        char[] o1Array = o1.toCharArray();
        char[] o2Array = o2.toCharArray();
        int index = 0;
        while (index < o1Array.length && index < o2Array.length) {
            result = o1Array[index] - o2Array[index];
            if (result != 0) {
                break;
            }
            index++;
        }
        if (result == 0 & o1Array.length != o2Array.length) {
            result = o2Array.length - o1Array.length;
        }
        return result;
    }
}
