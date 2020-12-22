package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] rsl = new int[100];
        int size = 0;
        int coinNumber = 0;
        money -= price;
        while (money != 0) {
            for (int i = 0; i < rsl.length; i++) {
                money -= coins[coinNumber];
                size++;
                rsl[i] = coins[coinNumber];
                if (money - coins[coinNumber] <= 0) {
                    coinNumber++;
                }
                if (money == 0) {
                    break;
                }
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
