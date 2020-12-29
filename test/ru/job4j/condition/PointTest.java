//package ru.job4j.condition;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class PointTest {
//
//    @Test
//    public void whenThen10to20then1() {
//        int expected = 1;
//
//        int x1 = 1,
//                y1 = 0,
//                x2 = 2,
//                y2 = 0;
//        double out = Point.distance(x1, y1, x2, y2);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//
//    @Test
//    public void whenThen20to20then2() {
//        int expected = 2;
//
//        int x1 = 2,
//                y1 = 0,
//                x2 = 2,
//                y2 = 2;
//        double out = Point.distance(x1, y1, x2, y2);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//
//    @Test
//    public void whenThen11to21then1() {
//        int expected = 1;
//
//        int x1 = 1,
//                y1 = 1,
//                x2 = 2,
//                y2 = 1;
//        double out = Point.distance(x1, y1, x2, y2);
//        Assert.assertEquals(expected, out, 0.01);
//    }
//}