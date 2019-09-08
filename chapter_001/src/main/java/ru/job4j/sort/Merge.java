package ru.job4j.sort;

import java.util.Arrays;

public class Merge {

    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int first = 0;
        int second = 0;
        while ((first + second) < result.length) {
            if (first == (left.length)) {
                result[first + second] = right[second];
                second++;
                continue;
            }
            if (second == (right.length)) {
                result[first + second] = left[first];
                first++;
                continue;
            }
            if (left[first] < right[second]) {
                result[first + second] = left[first];
                first++;
            } else {
                result[first + second] = right[second];
                second++;
            }
        }
        return result;
    }
}
