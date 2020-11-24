package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result = 0;
        if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
            result = Math.abs(x2 - x1);
            return result;
        } else {
            return result;
        }
    }
}
