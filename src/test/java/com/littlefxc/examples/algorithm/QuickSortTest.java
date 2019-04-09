package com.littlefxc.examples.algorithm;

import com.littlefxc.examples.algorithm.sort.SortTestHelper;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void sort() {
        int N = 10000000;
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.MergeSort", "sort", arr1);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.QuickSort", "sort", arr2);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.QuickSort", "sort2", arr3);
    }

    /**
     * 排序近乎有序的数组:使用随机定点
     */
    @Test
    public void sortNearlyOrderedArray() {
        int N = 10000000;
        Integer[] arr1 = SortTestHelper.generateNearlyOrderedArray(N, 1);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.MergeSort", "sort", arr1);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.QuickSort", "sort", arr2);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.QuickSort", "sort2", arr3);
    }

    /**
     * 一旦有大量重复的元素，版本2又有问题：被排序的数组的树极不平衡，时间复杂度退化为O(N^2)
     * 解决办法是使用双路快速排序，经过测试可以在1秒内轻松处理100万数量集的数据同时要比归并排序快
     */
    @Test
    public void sort3() {
        int N = 1000000;
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, 10);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.MergeSort", "sort", arr1);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.QuickSort", "sort", arr2);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.QuickSort", "sort2", arr3);
    }

    /**
     * 使用三路快速排序
     */
    @Test
    public void sort4() {
        int N = 1000000;
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, 10);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.MergeSort", "sort", arr1);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.QuickSort", "sort", arr2);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.QuickSort", "sort2", arr3);
    }
}