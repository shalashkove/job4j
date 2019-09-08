package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int monthly, double percent) {
        int year = 0;
        double debt = amount;
        while (debt > 0) {
            if (debt * percent / 100 >= monthly * 12) {
                year = Integer.MAX_VALUE;
                break;
            }
            debt = debt * (100 + percent) / 100;
            debt = debt - 12 * monthly;
            year++;
        }
        return year;
    }
}