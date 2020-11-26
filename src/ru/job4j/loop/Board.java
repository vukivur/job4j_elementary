package ru.job4j.loop;

public class Board {
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int element = 0; element < width; element++) {
               if (row % 2 == 0) {
                   if (element % 2 == 0) {
                       System.out.print("X");
                   } else {
                       System.out.print(" ");
                   }
               } else {
                   if (element % 2 == 0) {
                       System.out.print(" ");
                   } else {
                       System.out.print("X");
                   }
               }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Board.paint(3, 3);
        System.out.println();
        Board.paint(5, 4);
        System.out.println();
        Board.paint(7, 7);
    }
}
