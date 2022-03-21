package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point one = new Point(0, 0);
        Point two = new Point(0, 2);
            double out = one.distance(two);
            Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to02then1() {
        double expected = 1;
        Point one = new Point(0, 1);
        Point two = new Point(0, 2);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when01to11then1() {
        double expected = 1;
        Point one = new Point(0, 1);
        Point two = new Point(1, 1);
        double out = one.distance(two);
        Assert.assertEquals(expected, out, 0.01);
    }
}
