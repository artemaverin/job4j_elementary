package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SortSelectedTest {

    @Test
    public void whenSortArrayOf5elements() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf3elements() {
        int[] data = new int[] {12, 4, -1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-1, 4, 12};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSortArrayOf5elements2() {
        int[] data = new int[] {33, 0, -10, -2, 15};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-10, -2, 0, 15, 33};
        Assert.assertArrayEquals(expected, result);
    }
}