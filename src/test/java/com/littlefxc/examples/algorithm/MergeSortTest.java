package com.littlefxc.examples.algorithm;

import com.littlefxc.examples.algorithm.sort.SortTestHelper;
import org.junit.Test;

import java.util.Arrays;

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
//        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.InsertionSort", "sort1", arr1);
//        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.InsertionSort", "sort2", arr2);
//        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.InsertionSort", "sort3", arr3);
//        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.SelectionSort", "sort", arr4);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.MergeSort", "sort", arr5);
    }

    @Test
    public void sort2() {
        int N = 50000;
        Integer[] arr1 = SortTestHelper.generateNearlyOrderedArray(N, 5);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("近乎有序的数组排序");
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.MergeSort", "sort", arr1);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.InsertionSort", "sort", arr2);
    }
}