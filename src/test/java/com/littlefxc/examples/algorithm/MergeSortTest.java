package com.littlefxc.examples.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    @Test
    public void sort() {
        int N = 50000;
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, 50000);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr4 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr5 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("完全无序的数组排序");
//        SortTestHelper.testSort("com.littlefxc.examples.algorithm.InsertionSort", "sort1", arr1);
//        SortTestHelper.testSort("com.littlefxc.examples.algorithm.InsertionSort", "sort2", arr2);
//        SortTestHelper.testSort("com.littlefxc.examples.algorithm.InsertionSort", "sort3", arr3);
//        SortTestHelper.testSort("com.littlefxc.examples.algorithm.SelectionSort", "sort", arr4);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.MergeSort", "sort", arr5);
    }

    @Test
    public void sort2() {
        int N = 50000;
        Integer[] arr1 = SortTestHelper.generateNearlyOrderedArray(N, 5);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("近乎有序的数组排序");
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.MergeSort", "sort", arr1);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.InsertionSort", "sort", arr2);
    }
}