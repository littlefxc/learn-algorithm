package com.littlefxc.examples.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class QuickSortTest {

    @Test
    public void sort() {
        int N = 50000000;
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.QuickSort", "sort", arr1);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.QuickSort", "sort", arr2);
    }

    /**
     * 排序近乎有序的数组
     */
    @Test
    public void sortNearlyOrderedArray() {
        int N = 10000000;
        Integer[] arr1 = SortTestHelper.generateNearlyOrderedArray(N, 1);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.QuickSort", "sort", arr1);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.MergeSort", "sort", arr2);
    }
}