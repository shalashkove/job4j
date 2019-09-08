package ru.job4j.loop;

public class Counter {
    public int add(int start, int finish) {
        int sum = 0;
        if (start < finish) {
            for (int i = start; i <= finish; i++)    {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        } else {
            for (int i = finish; i <= start; i++)    {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
        }
        return sum;
    }
}
