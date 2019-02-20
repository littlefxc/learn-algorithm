package com.littlefxc.examples.algorithm;

import java.util.Arrays;

/**
 * @author fengxuechao
 * @date 2019-02-20
 */
public class HeapSort2 {

    private HeapSort2() {
    }

    // 对整个arr数组使用HeapSort2排序
    // HeapSort2, 借助我们的heapify过程创建堆
    // 此时, 创建堆的过程时间复杂度为O(n), 将所有元素依次从堆中取出来, 实践复杂度为O(nlogn)
    // 堆排序的总体时间复杂度依然是O(nlogn), 但是比HeapSort1性能更优, 因为创建堆的性能更优
    public static void sort(Comparable[] arr) {
        int n = arr.length;
        MaxHeap<Comparable> maxHeap = new MaxHeap<Comparable>(arr);
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = maxHeap.extractMax();
        }
    }

    // 测试 HeapSort2
    public static void main(String[] args) {
        int N = 1000000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, N);
//        Integer[] arr = SortTestHelper.generateNearlyOrderedArray(N, 5);
//        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100);
        Integer[] arr2 = Arrays.copyOf(arr, N);
        Integer[] arr3 = Arrays.copyOf(arr, N);
        Integer[] arr4 = Arrays.copyOf(arr, N);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.HeapSort2", "sort", arr);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.HeapSort1", "sort", arr2);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.QuickSort", "sort", arr3);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.MergeSort", "sort", arr4);
    }
}
