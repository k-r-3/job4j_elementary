package ru.job4j.condition;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point another) {
        return sqrt((pow((this.x - another.x), 2) + (pow((this.y - another.y), 2))));
    }

    public static void main(String[] args) {
        Point a = new Point(1, 1);
        Point b = new Point(2, 1);
        double distance = a.distance(b);
        System.out.println(distance);
    }
}
