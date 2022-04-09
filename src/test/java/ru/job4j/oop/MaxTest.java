package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void max() {
        int expected = 3;
        Max first = new Max();
        int res = first.max(1, 2, 3);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void testMax() {
        int expected = 2;
        Max first = new Max();
        int res = first.max(1, 2, 2);
        Assert.assertEquals(expected, res);
    }

    @Test
    public void testMax1() {
        int expected = 2;
        Max first = new Max();
        int res = first.max(1, 2, 2, 2);
        Assert.assertEquals(expected, res);
    }
}