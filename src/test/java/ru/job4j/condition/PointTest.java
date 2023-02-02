package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest  {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when125to28then10dot44() {
        double expected = 10.44;
        Point a = new Point(12, 5);
        Point b = new Point(2, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when63to44then2dot23() {
        double expected = 2.23;
        Point a = new Point(6, 3);
        Point b = new Point(4, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus810to1010then18() {
        double expected = 18;
        Point a = new Point(-8, 10);
        Point b = new Point(10, 10);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to23to44then1() {
        int expected = 1;
        Point c = new Point(0, 2, 4);
        Point d = new Point(0, 3, 4);
        double dist = c.distance3d(d);
        Assert.assertEquals(expected, dist, 0.01);
    }
}
