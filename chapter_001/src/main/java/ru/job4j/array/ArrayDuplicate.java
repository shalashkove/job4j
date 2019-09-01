package ru.job4j.array;

import java.util.Arrays;

public class ArrayDuplicate {
    public String[] remove(String[] array) {
        int dublicateIndex = array.length;
        for (int out = 0; out < dublicateIndex; out++) {
            for (int in = out + 1; in < dublicateIndex; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[dublicateIndex - 1];
                    dublicateIndex--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, dublicateIndex);
    }
}
