package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        char[] leftChar = left.toCharArray();
        char[] rightChar = right.toCharArray();
        int minLength = Math.min(leftChar.length, rightChar.length);
        for (int i = 0; i != minLength; i++) {
            result = Character.compare(leftChar[i], rightChar[i]);
            if (result != 0) {
                break;
            }
        }
        if (result == 0) {
            result = Integer.compare(left.length(), right.length());
        }
        return result;
    }
}
