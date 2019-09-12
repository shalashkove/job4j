package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public int max(int first, int second, int third) {
        int result = first > max(second, third) ? first : max(second, third);
        return result;
    }

    public int max(int first, int second, int third, int fourth) {
        int result = max(first, second) > max(third, fourth) ? max(first, second) : max(third, fourth);
        return result;
    }
}
