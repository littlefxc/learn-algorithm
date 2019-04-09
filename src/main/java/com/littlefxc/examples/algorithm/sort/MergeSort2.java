package com.littlefxc.examples.algorithm.sort;


/**
 * 自底向上归并排序，对于链表的数据结构比自顶向下归并排序更适合
 */
public class MergeSort2 {

    private MergeSort2() {
    }

    public static void sort(Comparable[] arr) {
        int n = arr.length;

        // 对于小数组, 使用插入排序优化
        for (int i = 0; i < n; i += 16) {
            InsertionSort.insertionSort(arr, i, Math.min(i + 15, n - 1));
        }

        for (int size = 1; size < n; size *= 2) {
            for (int i = 0; i + size < n; i += 2 * size) {
                // 对于arr[mid] <= arr[mid+1]的情况,不进行merge
                if (arr[i + size - 1].compareTo(arr[i + size]) > 0) {
                    // 对 arr[i...i+size-1] 和 arr[i+size...i+2*size-1] 进行归并
                    MergeSort.merge(arr, i, i + size - 1, Math.min(i + 2 * size - 1, n - 1));
                }
            }
        }
    }

}
