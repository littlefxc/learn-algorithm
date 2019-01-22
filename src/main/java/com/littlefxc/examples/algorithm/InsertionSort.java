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

    /**
     * 经过测试选择"插入排序写法 3"
     *
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        sort3(arr);
    }

    /**
     * 插入排序:对区间[left,right]进行排序
     *
     * @param arr
     * @param left
     * @param right
     */
    public static void insertionSort(Comparable[] arr, int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            Comparable key = arr[i];
            int j = i - 1;
            while (j > left && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j] = key;
        }
    }

    /**
     * 插入排序写法 3
     *
     * @param arr
     */
    public static void sort3(Comparable[] arr) {
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
    public static void sort2(Comparable[] arr) {
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
    public static void sort1(Comparable[] arr) {
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
