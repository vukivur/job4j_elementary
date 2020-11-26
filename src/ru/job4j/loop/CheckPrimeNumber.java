package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean result = false;
        int counter = 0;
        if (number >= 2) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    counter++;
                    if (counter > 2) {
                        break;
                    }
                }
            }
            if (counter == 2) {
                result = true;
            }
        }
        return result;
    }
}
