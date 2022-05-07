package ru.job4j.condition;

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
    public void whenMax45ToMinus3Then45() {
        int left = 45;
        int right = -3;
        int result = Max.max(left, right);
        int expected = 45;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax104ToMinus234Then234() {
        int left = 104;
        int right = 234;
        int result = Max.max(left, right);
        int expected = 234;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax666ToMinus666Then666() {
        int left = 666;
        int right = 666;
        int result = Max.max(left, right);
        int expected = 666;
        Assert.assertEquals(result, expected);
    }
}