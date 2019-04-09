package com.littlefxc.examples.algorithm;

import com.littlefxc.examples.algorithm.sort.SortTestHelper;
import org.junit.Test;

import java.util.Arrays;

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
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, 10000);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr4 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("完全无序的数组排序");
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.InsertionSort", "sort1", arr1);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.InsertionSort", "sort2", arr2);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.InsertionSort", "sort3", arr3);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.SelectionSort", "sort", arr4);
    }


    /**
     * 用插入排序和选择排序比较近乎有序的数组之间的性能
     */
    @Test
    public void sortNearlyOrderedArray() {
        int N = 20000;
        Integer[] arr1 = SortTestHelper.generateNearlyOrderedArray(N, 1);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr3 = Arrays.copyOf(arr1, arr1.length);
        Integer[] arr4 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("近乎有序的数组排序");
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.InsertionSort", "sort1", arr1);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.InsertionSort", "sort2", arr2);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.InsertionSort", "sort3", arr3);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.SelectionSort", "sort", arr4);
    }
}