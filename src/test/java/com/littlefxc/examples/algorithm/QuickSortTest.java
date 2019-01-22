package com.littlefxc.examples.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void sort() {
        int N = 50000;
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, 50000);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.QuickSort", "sort", arr1);
    }
}