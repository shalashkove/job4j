package ru.job4j.loop;

public class PrimeNumber {
    public int calc(int finish) {
        int count = 0;
        boolean divided;
        for (int j = 2; j <= finish; j++) {
            divided = false;
            for (int i = 2; i < j; i++) {
                if ((j % i) == 0) {
                    divided = true;
                    break;
                }
            }
            count = divided ? count : ++count;
        }
        return count;
    }
}