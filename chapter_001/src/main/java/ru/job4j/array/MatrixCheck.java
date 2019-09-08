package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;
        boolean first = data[0][0];
        boolean second = data[data.length - 1][0];
        for (int i = 0; i != data.length; i++) {
            if (first != data[i][i]) {
                result = false;
                break;
            }
            if (second != data[data.length - 1 - i][i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}