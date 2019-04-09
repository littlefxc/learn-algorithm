package com.littlefxc.examples.algorithm.sort;

import java.util.Arrays;

/**
 * 堆排序第一个版本
 *
 * @author fengxuechao
 * @date 2019-02-20
 */
public class HeapSort1 {

    /**
     *
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        MaxHeap maxHeap = new MaxHeap(arr.length);
        for (int i = 0; i < arr.length; i++) {
            maxHeap.insert(arr[i]);
        }

        // 从小到大排序
        for (int i = arr.length - 1; i >= 0 ; i--) {
            arr[i] = maxHeap.extractMax();
        }
    }

    public static void main(String[] args) {
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        Integer[] arr2 = Arrays.copyOf(arr, N);
        Integer[] arr3 = Arrays.copyOf(arr, N);
        Integer[] arr4 = Arrays.copyOf(arr, N);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.HeapSort1", "sort", arr);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.HeapSort2", "sort", arr2);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.QuickSort", "sort", arr3);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.sort.MergeSort", "sort", arr4);
    }
    
    
}
