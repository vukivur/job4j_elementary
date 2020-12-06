package ru.job4j.oop;

public class Cat {

    private String food;

    private String name;

    public void giveNick(String nick) {
        this.name = nick;
    }

    public void show() {
        System.out.println("Name: " + this.name + ", Food: " + this.food);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("Monster");
        gav.show();
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("Black Monster");
        black.show();
    }
}
