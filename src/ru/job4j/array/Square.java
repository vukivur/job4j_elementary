package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] result = new int[bound];
        for (int index = 0; index < result.length; index++) {
            result[index] = (int) Math.pow(index, 2);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arrayFirst = calculate(4);
        for (int element : arrayFirst) {
            System.out.println(element);
        }

        System.out.println();
        int[] arraySecond = calculate(10);
        for (int element : arraySecond) {
            System.out.println(element);
        }
    }
}
