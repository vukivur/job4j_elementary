package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = first;
        if (result > second) {
            if (result > third) {
                return result;
            } else {
                result = third;
                return result;
            }
        } else {
            if (second > third) {
                result = second;
                return result;
            } else {
                result = third;
                return result;
            }
        }
    }
}
