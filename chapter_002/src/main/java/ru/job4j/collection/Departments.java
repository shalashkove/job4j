package ru.job4j.collection;

import java.util.*;

public class Departments {

    public static List<String> fillGaps(List<String> deps) {
        HashSet<String> tmp = new HashSet<>();
        for (String value : deps) {
            String start = "";
            for (String el : value.split("/")) {
                start += start.length() != 0 ? "/" + el : el;
                tmp.add(start);
            }
        }
        ArrayList<String> result = new ArrayList<String>(tmp);
        Collections.sort(result, Comparator.naturalOrder());
        return result;
    }

    public static void sortAsc(List<String> orgs) {
    }

    public static void sortDesc(List<String> orgs) {
    }
}
