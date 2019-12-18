package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int i = 0;
        while (i < left.length() || i < right.length()) {
            if (i >= left.length()) {
                result = 0 - right.charAt(i);
                break;
            }
            if (i >= right.length()) {
                result = left.charAt(i) - 0;
                break;
            }
            result = left.charAt(i) - right.charAt(i);
            if (result != 0) {
                break;
            }
            i++;
        }
        return result;
    }
}
