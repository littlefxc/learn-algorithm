package com.littlefxc.examples.algorithm;

import org.junit.Test;

/**
 * 测试插入排序
 *
 * @author fengxuechao
 */
public class InsertionSortTest {

    /**
     * 比较选择排序
     */
    @Test
    public void sort() {
        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 10000);
        System.out.println("完全无序的数组排序");
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.InsertionSort", arr);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.SelectionSort", arr);
    }


    /**
     * 用插入排序和选择排序比较近乎有序的数组之间的性能
     */
    @Test
    public void sortNearlyOrderedArray() {
        int N = 20000;
        Integer[] arr = SortTestHelper.generateNearlyOrderedArray(N, 5);
        System.out.println("近乎有序的数组排序");
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.InsertionSort", arr);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.SelectionSort", arr);
    }
}