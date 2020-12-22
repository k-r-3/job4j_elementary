package ru.job4j.array;

public class MatrixSum {
    public static int sum(int[][] array) {
        int rsl = 0;
        for (int i = 0; i < array.length; i++) {
            int size = array[i].length;
            for (int j = 0; j < size; j++) {
                rsl += array[i][j];
            }
        }
        return rsl;
    }
}
