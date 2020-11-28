package ru.job4j.loop;

public class PrimeNumber {
    public static int calc(int finish) {
        int number = 0;
        for (int i = 2; i <= finish; i++) {
            if (CheckPrimeNumber.check(i)) {
               number++;
            }
        }
        return number;
    }
}
