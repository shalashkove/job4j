package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;

        boolean isDivided;
        for (int j = 2; j <= finish; j++) {
            isDivided = false;
            for (int i = 2; i < j; i++) {
                if ((j % i) == 0) {
                    isDivided = true;
                    break;
                }
            }

            count = isDivided ? count : ++count;
        }

        return count;
    }
}