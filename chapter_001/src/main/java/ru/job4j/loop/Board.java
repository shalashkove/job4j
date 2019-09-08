package ru.job4j.loop;

public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String line = System.getProperty("line.separator");
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (((i + j) % 2) == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(line);
        }
        return screen.toString();
    }
}