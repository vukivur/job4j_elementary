package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic test = new DummyDic();
        String result = test.engToRus("Rain");
        System.out.println(result);
    }
}
