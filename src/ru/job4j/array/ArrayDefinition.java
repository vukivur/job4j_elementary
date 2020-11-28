package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];

        names[0] = "Chaffee";
        names[1] = "Patton";
        names[2] = "Heavy";
        names[3] = "Hellcat";

        System.out.println("Размер массива 'ages' равен: " + ages.length);
        System.out.println("Размер массива 'surnames' равен: " + surnames.length);
        System.out.println("Размер массива 'prices' равен: " + prices.length);

        System.out.println("\nArray 'names':\n");
        for (String index : names) {
            System.out.println(index);
        }
    }
}
