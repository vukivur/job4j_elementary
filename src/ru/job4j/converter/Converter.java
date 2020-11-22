package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        int dollar = Converter.rubleToDollar(500);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("500 rubles are " + dollar + " dollar.");
        System.out.println();

        int in = 140;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);

        in = 500;
        expected = 8;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("500 rubles are 8 dollars. Test result : " + passed);
    }
}
