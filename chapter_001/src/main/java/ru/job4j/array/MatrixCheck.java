package ru.job4j.array;

public class MatrixCheck {
    public boolean mono(boolean[][] data) {
        boolean result = true;

        boolean isChanged = data[0][0];
        for (int i = 0; i != data.length; i++) {
            if (isChanged != data[i][i]) {
                result = false;
            }
        }

        isChanged = data[data.length - 1][0];
        for (int i = 0; i != data.length; i++) {
            if (isChanged != data[data.length - 1 - i][i]) {
                result = false;
            }
        }

        return result;
    }
}