package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenThen10to20then1() {
        int expected = 1;
        Point first = new Point(1, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenThen20to20then2() {
        int expected = 2;
        Point first = new Point(2, 0);
        Point second = new Point(2, 2);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenThen11to21then1() {
        int expected = 1;
        Point first = new Point(1, 1);
        Point second = new Point(2, 1);
        double out = first.distance(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenThen111to211then1() {
        double expected = 1.0;
        Point first = new Point(1, 1, 1);
        Point second = new Point(2, 1, 1);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenThen112to120then2Point24() {
        double expected = 2.24;
        Point first = new Point(1, 1, 2);
        Point second = new Point(1, 2, 0);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenThen225to522then4Point24() {
        double expected = 4.24;
        Point first = new Point(2, 2, 5);
        Point second = new Point(5, 2, 2);
        double out = first.distance3d(second);
        Assert.assertEquals(expected, out, 0.01);
    }
}