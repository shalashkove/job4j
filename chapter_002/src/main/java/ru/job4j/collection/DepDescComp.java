package ru.job4j.collection;

import java.util.*;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int result = 0;
        List<String> o1ArrayList = Arrays.asList(o1.split("/"));
        List<String> o2ArrayList = Arrays.asList(o2.split("/"));
        int index = 0;
        while (true) {
            if (index >= o1ArrayList.size() & index >= o2ArrayList.size()) {
                break;
            }
            if (index >= o1ArrayList.size() & index < o2ArrayList.size()) {
                result = 1;
                break;
            }
            if (index < o1ArrayList.size() & index >= o2ArrayList.size()) {
                result = -1;
                break;
            }
            result = o1ArrayList.get(index).compareTo(o2ArrayList.get(index));
            if (result != 0) {
                break;
            }
            index++;
        }
        return result;
    }
}
