package com.littlefxc.examples.algorithm;

/**
 * 选择排序
 *
 * @author fengxuechao
 * @date 2019/1/17
 **/
public class SelectionSort {

    private SelectionSort() {
    }

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // 寻找数组在区间[i, n)的最小值
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);

        }
    }

    /**
     * 交换元素在数组的中位置
     *
     * @param arr 被交换元素所在的数组
     * @param i   被交换元素i的索引
     * @param j   被交换元素j的索引
     */
    private static void swap(Object[] arr, int i, int j) {
        Object objTmp = arr[i];
        arr[i] = arr[j];
        arr[j] = objTmp;
    }
}
