package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] array = {{0}, {1, 2}, {3, 4, 5}, {6, 7, 8, 9}};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Размер вложенного массива " +  i + " равен " + array[i].length);
        }
    }
}
