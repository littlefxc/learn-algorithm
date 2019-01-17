package com.littlefxc.examples.algorithm;

public class MergeSort {

    private MergeSort() {
    }

    /**
     * @param arr
     * @param p   数组arr的第一个索引
     * @param r   数组arr的最后一个索引
     */
    public static void sort(Comparable[] arr, int p, int r) {
        assert p < r;
        int q = (r - p) / 2;
        sort(arr, p, q);
        sort(arr, q + 1, r);
        merge(arr, p, q, r);
    }

    /**
     * @param arr
     * @param p   数组arr的第一个索引
     * @param q   数组的中间索引
     * @param r   数组的最后一个索引
     */
    private static void merge(Comparable[] arr, int p, int q, int r) {
        int n1 = q - p;
        int n2 = r - q + 1;
        Comparable[] newArr = new Comparable[r];
        for (int i = 0; i <= n1; i++) {
            newArr[i] = arr[p + i];
        }
        for (int j = 0; j <= n2; j++) {
            newArr[j] = arr[q + j + 1];
        }
        int i = p;
        int j = q + 1;
        for (int k = p; k <= r; k++) {
            if (i>n1) {
                arr[k] = newArr[j];
                j++;
            } else if (j > n2) {
                arr[k] = newArr[i];
                i++;
            } else if (newArr[i].compareTo(newArr[j]) <= 0) {
                arr[k] = newArr[i];
                i++;
            } else {
                arr[k] = newArr[j];
                j++;
            }
        }
    }
}
