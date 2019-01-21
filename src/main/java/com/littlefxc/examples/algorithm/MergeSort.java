package com.littlefxc.examples.algorithm;

import java.util.Arrays;

public class MergeSort {

    private MergeSort() {
    }

    public static void sort(Comparable[] arr) {

        int n = arr.length;
        sort(arr, 0, n - 1);
    }

    /**
     * @param arr
     * @param left  被排序数组的第一个索引
     * @param right 被排序数组的最后一个索引
     */
    private static void sort(Comparable[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        // todo 当left + right > Integer.MAX_VALUE时, 发生数据溢出情况
        int midIndex = (left + right) / 2;
        sort(arr, left, midIndex);
        sort(arr, midIndex + 1, right);
        merge(arr, left, midIndex, right);
    }

    /**
     *
     * @param arr
     * @param left
     * @param midIndex
     * @param right
     */
    private static void merge(Comparable[] arr, int left, int midIndex, int right) {
        Comparable[] copy = Arrays.copyOfRange(arr, left, right + 1);

        int i = left;
        int j = midIndex + 1;
        for (int k = left; k <= right; k++) {
            if (i > midIndex) {
                // 左边数组已取完, j-left 表示减去偏移量
                arr[k] = copy[j-left];
                j++;
            } else if (j > right) {
                // 右边数组已取完, i-left 表示减去偏移量
                arr[k] = copy[i - left];
                i++;
            } else if (copy[i - left].compareTo(copy[j - left]) >= 0) {
                // 左边数组大于等于右边数组
                arr[k] = copy[j - left];
                j++;
            } else {
                // 右边数组大于左边数组
                arr[k] = copy[i - left];
                i++;
            }
        }
    }
}
