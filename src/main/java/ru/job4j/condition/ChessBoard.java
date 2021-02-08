package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int result  = 0;
        if ((x1 + y1) % 2 == 0 && (x2 + y2) % 2 == 0) {
                result = Math.abs(y1 - y2);
        } else if ((x1 + y1) % 2 != 0 && (x2 + y2) % 2 != 0) {
                result = Math.abs(y1 - y2);
        }
        return result;
    }

}
