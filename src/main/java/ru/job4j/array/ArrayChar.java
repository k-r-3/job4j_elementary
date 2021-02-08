package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        int size = Math.min(word.length, pref.length);
        for (int i = 0; i < size; i++) {
            result = word[i] == pref[i];
            if (!result) {
                break;
            }
        }
        return result;
    }
}
