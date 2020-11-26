package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = true;
        int counter = 0;
        for (int i = 0; i < number; i++) {
            if (number % 2 == 0) {
                counter++;
            }
            if (counter > 3 || number < 2) {
                prime = false;
                break;
            }
        }
        return prime;
    }
}
