package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private final int[] coins = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int[] result = new int[100];
        int sum = money - price;
        int count = 0;
        while (sum > 0) {
            for (int i = 0; i < coins.length; i++) {
                while (sum >= coins[i]) {
                    sum -= coins[i];
                    result[count] = coins[i];
                    count++;
                }
            }
        }
        int size = count;
        return Arrays.copyOf(result, count);
    }
}
