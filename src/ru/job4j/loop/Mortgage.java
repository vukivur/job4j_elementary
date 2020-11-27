package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        int debt;
        while (amount > 0) {
            debt = amount;
            amount = (int) (amount * percent) + debt - salary;
            year++;
        }
        return year;
    }
}
