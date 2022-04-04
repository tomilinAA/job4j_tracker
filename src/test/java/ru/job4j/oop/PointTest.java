package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
        public void when00to20then2() {
            int expected = 2;
            Point a = new Point(0, 0);
            Point b = new Point(0, 2);
            double out = a.distance(b);
            Assert.assertEquals(expected, out, 0.01);
        }

    @Test
    public void when04to23then2dot23() {
        double expected = 2.23;
        Point a = new Point(0, 4);
        Point b = new Point(2, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when12to23then1dot41() {
        double expected = 1.41;
        Point a = new Point(1, 2);
        Point b = new Point(2, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when22to44then2dot82() {
        double expected = 2.82;
        Point a = new Point(2, 2);
        Point b = new Point(4, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}