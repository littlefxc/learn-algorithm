package com.littlefxc.examples.algorithm;

public class QuickSort {
    private QuickSort() {
    }

    public static void sort(Comparable[] arr) {

        sort(arr, 0, arr.length - 1);

    }

    private static void sort(Comparable[] arr, int p, int r) {
        if (p >= r) {
            return;
        }

        int q = partition2(arr, p, r);
        sort(arr, p, q - 1);
        sort(arr, q + 1, r);
    }

    /**
     * 写法 1 - 出自《算法导论》
     * @param arr
     * @param p
     * @param r
     * @return
     */
    private static int partition1(Comparable[] arr, int p, int r) {
        // 写法 2
        Comparable key = arr[r];
        int i = p;
        for (int j = i; j < r; j++) {
            if (arr[j].compareTo(key) <= 0) {
                swap(arr, i++, j);
            }
        }
        swap(arr, i, r);
        return i;
    }

    /**
     * 写法 2
     * @param arr
     * @param p
     * @param r
     * @return
     */
    private static int partition2(Comparable[] arr, int p, int r) {
        Comparable key = arr[p];
        int i = p;
        for (int j = p + 1; j <= r; j++) {
            if(arr[j].compareTo(key) < 0) {
                swap(arr, ++i, j);
            }
        }
        swap(arr, i, p);
        return i;
    }

    private static void swap(Object[] arr, int i, int j) {
        Object objTmp = arr[i];
        arr[i] = arr[j];
        arr[j] = objTmp;
    }
}
