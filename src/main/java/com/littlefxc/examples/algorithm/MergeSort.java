package com.littlefxc.examples.algorithm;

import java.util.Arrays;

public class MergeSort {

    private MergeSort() {
    }

    // 将arr[l...mid]和arr[mid+1...r]两部分进行归并
    private static void merge(Comparable[] arr, int l, int mid, int r) {

        Comparable[] aux = Arrays.copyOfRange(arr, l, r + 1);

        // 初始化，i指向左半部分的起始索引位置l；j指向右半部分起始索引位置mid+1
        int i = l, j = mid + 1;
        for (int k = l; k <= r; k++) {

            if (i > mid) {  // 如果左半部分元素已经全部处理完毕
                arr[k] = aux[j - l];
                j++;
            } else if (j > r) {   // 如果右半部分元素已经全部处理完毕
                arr[k] = aux[i - l];
                i++;
            } else if (aux[i - l].compareTo(aux[j - l]) < 0) {  // 左半部分所指元素 < 右半部分所指元素
                arr[k] = aux[i - l];
                i++;
            } else {  // 左半部分所指元素 >= 右半部分所指元素
                arr[k] = aux[j - l];
                j++;
            }
        }
    }

    // 递归使用归并排序,对arr[l...r]的范围进行排序
    private static void sort(Comparable[] arr, int l, int r) {

        if (l >= r)
            return;

        int mid = (l + r) / 2;
        sort(arr, l, mid);
        sort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void sort(Comparable[] arr) {

        int n = arr.length;
//        sort(arr, 0, n-1);
        sort2(arr, 0, n - 1);
    }

    /**
     * @param arr
     * @param left   被排序数组的第一个索引
     * @param right   被排序数组的最后一个索引
     */
    private static void sort2(Comparable[] arr, int left, int right) {
        if (left >= right) return;
        int midIndex = (left + right) / 2;
        sort2(arr, left, midIndex);
        sort2(arr, midIndex + 1, right);
        merge2(arr, left, midIndex, right);
    }

    private static void merge2(Comparable[] arr, int left, int midIndex, int right) {

    }
}
