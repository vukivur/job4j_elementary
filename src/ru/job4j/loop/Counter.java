package ru.job4j.loop;

public class Counter {
    public static int sum(int start, int finish) {
        int sum = 0;
        if (start <= finish) {
            for (int i = start; i <= finish; i++) {
                sum += i;
            }
        }
        return sum;
    }
}