package ru.job4j.calculator;


public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static Double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 175;
        double man = Fit.manWeight(height);
        System.out.println("Man 175 is " + man);
        height = 168;
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 168 is " + woman);
    }

}
