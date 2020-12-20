package ru.job4j.condition;

import org.jetbrains.annotations.NotNull;

public class N {
    public static boolean check(String l, String r) {
        if (l.isEmpty() && r.isEmpty()) {
            return true;
        } else if (l.charAt(0) == r.charAt(r.length()) && l.charAt(l.length()) == r.charAt(0)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(check("", ""));
    }
}
