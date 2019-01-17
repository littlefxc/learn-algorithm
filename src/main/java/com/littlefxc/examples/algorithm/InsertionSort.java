package com.littlefxc.examples.algorithm;

/**
 * 插入排序 TODO
 *
 * @author fengxuechao
 * @date 2019/1/17
 **/
public class InsertionSort {

    private InsertionSort() {
    }

    public static void sort(Comparable[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j++) {

            }
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
