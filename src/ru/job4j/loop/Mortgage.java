package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        percent *= 0.01;
        while (amount > 0) {
            amount += (amount * percent);
            amount -= salary;
            year++;
        }
        return year;
    }
}
