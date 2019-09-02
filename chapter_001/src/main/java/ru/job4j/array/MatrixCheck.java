package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean isChangedFirst = data[0][0];
        boolean isChangedSecond = data[data.length - 1][0];
        for (int i = 0; i != data.length; i++) {
            if (isChangedFirst != data[i][i]) {
                result = false;
            }
            if (isChangedSecond != data[data.length - 1 - i][i]) {
                result = false;
            }
        }
        return result;
    }
}