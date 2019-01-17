package com.littlefxc.examples.algorithm;

/**
 * 插入排序
 *
 * @author fengxuechao
 * @date 2019/1/17
 **/
public class InsertionSort {

    private InsertionSort() {
    }

    public static void sort(Comparable[] arr) {
        /* 写法 1 */
//        sort1(arr);
//        sort2(arr);
        sort3(arr);
    }

    /**
     * 插入排序写法 3
     *
     * @param arr
     */
    private static void sort3(Comparable[] arr) {
        for (int j = 1; j < arr.length; j++) {
            Comparable key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i].compareTo(key) > 0) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = key;
        }
    }

    /**
     * 插入排序写法 2
     *
     * @param arr
     */
    private static void sort2(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 && (arr[j].compareTo(arr[j - 1]) < 0); j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    /**
     * 插入排序写法 1
     *
     * @param arr
     */
    private static void sort1(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j].compareTo(arr[j - 1]) < 0) {
                    swap(arr, j, j - 1);
                }
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
