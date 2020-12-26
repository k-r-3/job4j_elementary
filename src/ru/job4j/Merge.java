package ru.job4j;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        System.arraycopy(left, 0, rsl, 0, left.length);
        System.arraycopy(right, 0, rsl, left.length, right.length);
        for (int i = 1; i < rsl.length; i++) {
            if (rsl[i] < rsl[i - 1]) {
                int temp = rsl[i - 1];
                rsl[i - 1] = rsl[i];
                rsl[i] = temp;
            }
        }
        return rsl;
    }
}
