package com.littlefxc.examples.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author fengxuechao
 * @date 2019/2/18
 **/
public class ShellSortTest {

    /**
     * 测试希尔排序 - 完全无序的数组排序
     */
    @Test
    public void sort() {
        int N = 100000;
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, N);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("完全无序的数组排序");
        // 交换法
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.ShellSort", "sort1", arr1);
        // 移动法
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.ShellSort", "sort2", arr2);

        // 直接插入法
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.InsertionSort", "sort", arr3);
    }

    /**
     * 测试希尔排序 - 近乎有序的数组排序
     */
    @Test
    public void sort2() {
        int N = 100000;
        Integer[] arr1 = SortTestHelper.generateNearlyOrderedArray(N, 5);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("近乎有序的数组排序");
        // 交换法
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.ShellSort", "sort1", arr1);
        // 移动法
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.ShellSort", "sort2", arr2);

        // 直接插入法
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.InsertionSort", "sort", arr3);
    }
}