package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus35to01then5() {
        double expected = 5;
        Point a = new Point(-3, 5);
        Point b = new Point(0, 1);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when213to50then13dot34() {
        double expected = 13.34;
        Point a = new Point(2, 13);
        Point b = new Point(5, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when10to50then4() {
        double expected = 4;
        Point a = new Point(1, 0);
        Point b = new Point(5, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when4101to161then5() {
        double expected = 5;
        Point a = new Point(4, 10, 1);
        Point b = new Point(1, 6, 1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when953to53min1then6() {
        double expected = 6;
        Point a = new Point(9, 5, 3);
        Point b = new Point(5, 3, -1);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}