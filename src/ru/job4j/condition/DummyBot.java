package ru.job4j.condition;

public class DummyBot {
    public static String answer(String question) {
        String result = "Это ставит меня в тупик. Задайте другой вопрос.";
        if (question.equals("Привет, Бот.")) {
            result = "Привет, умник.";
        } else if (question.equals("Пока.")) {
            result = "До скорой встречи.";
        }
        return result;
    }

    public static void main(String[] args) {
        String rsl = DummyBot.answer("Как дела?");
        System.out.println(rsl);
        rsl = DummyBot.answer("Привет, Бот.");
        System.out.println(rsl);
        rsl = DummyBot.answer("Пока.");
        System.out.println(rsl);
    }
}
