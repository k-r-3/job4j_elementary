package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i < data.length; i++) {
            result = data[1] == data[i];
            if (!result) {
                break;
            }
        }
        return result;
    }
}
