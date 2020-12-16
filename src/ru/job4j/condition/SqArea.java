package ru.job4j.condition;

public class SqArea {
    public static double square(double p, double k) {
        double h = p / (2 * (k + 1));
        double L = (p / (2 * (k + 1))) * k;
        double s = L * h;
        double rsl = s;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(6.0, 2.0);
        System.out.println(" p = 6.0, k = 2.0, s = 2.0, real = " + result1);
    }
}
