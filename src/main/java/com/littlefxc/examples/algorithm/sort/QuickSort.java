package com.littlefxc.examples.algorithm.sort;

/**
 * 快速排序
 */
public class QuickSort {
    private QuickSort() {
    }

    /**
     * 两路快速排序
     *
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    /**
     * 三路快速排序
     *
     * @param arr
     */
    public static void sort2(Comparable[] arr) {
        sortIn3Ways(arr, 0, arr.length - 1);

    }

    /**
     * 三路快速排序
     *
     * @param arr
     * @param l
     * @param r
     */
    private static void sortIn3Ways(Comparable[] arr, int l, int r) {

        // 对于小规模数组, 使用插入排序
        if (r - l <= 15) {
            InsertionSort.insertionSort(arr, l, r);
            return;
        }
        // 随机在arr[l...r]的范围中, 选择一个数值作为标定点pivot
        swap(arr, l, (int) (Math.random() * (r - l + 1)) + l);

        Comparable key = arr[l];
        // arr[l+1, lt] < key
        int lt = l;
        // arr[gt, r] > key
        int gt = r + 1;
        // arr[lt+1, i) == key
        int i = l + 1;
        while (i < gt) {
            if (arr[i].compareTo(key) < 0) {
                swap(arr, i, lt + 1);
                i++;
                lt++;
            } else if (arr[i].compareTo(key) > 0) {
                swap(arr, i, gt - 1);
                gt--;
            } else {
                i++;
            }
        }
        swap(arr, l, lt);

        sortIn3Ways(arr, l, lt - 1);
        sortIn3Ways(arr, gt, r);

    }

    /**
     * 版本更新：对于对于小规模数组, 使用插入排序
     *
     * @param arr
     * @param p
     * @param r
     * @version 2
     */
    private static void sort(Comparable[] arr, int p, int r) {
        // 对于小规模数组, 使用插入排序
        if (r - p <= 15) {
            InsertionSort.insertionSort(arr, p, r);
            return;
        }

        int q = partition3(arr, p, r);
        sort(arr, p, q - 1);
        sort(arr, q + 1, r);
    }

    /**
     * 写法 1 - 出自《算法导论》
     *
     * @param arr
     * @param p
     * @param r
     * @return
     */
    private static int partition1(Comparable[] arr, int p, int r) {
        // 随机在arr[l...r]的范围中, 选择一个数值作为标定点pivot
        swap(arr, p, (int) (Math.random() * (r - p + 1)) + p);

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
     * 版本更新：为解决排序近乎有序的数组, 快速排序退化成O(N^2)级别， 同时1000000大小的数组派出异常 java.lang.StackOverflowError
     * 解决办法：随机取分区点, 对于1000000大小的数组可以在1s内排序完成
     *
     * @param arr
     * @param p
     * @param r
     * @return
     * @version 2
     */
    private static int partition2(Comparable[] arr, int p, int r) {

        // 随机在arr[l...r]的范围中, 选择一个数值作为标定点pivot
        swap(arr, p, (int) (Math.random() * (r - p + 1)) + p);

        Comparable key = arr[p];
        int i = p;
        for (int j = p + 1; j <= r; j++) {
            if (arr[j].compareTo(key) < 0) {
                swap(arr, j, ++i);
            }
        }
        swap(arr, p, i);
        return i;
    }

    /**
     * 一旦有大量重复的元素，版本2又有问题：被排序的数组的树极不平衡，时间复杂度退化为O(N^2)
     * 解决办法：双路快速排序
     *
     * @param arr
     * @param p
     * @param r
     * @return
     */
    private static int partition3(Comparable[] arr, int p, int r) {
        // 随机在arr[l...r]的范围中, 选择一个数值作为标定点pivot
        swap(arr, p, (int) (Math.random() * (r - p + 1)) + p);

        Comparable key = arr[p];
        int i = p + 1, j = r;
        while (true) {
            while (i <= r && arr[i].compareTo(key) < 0) {
                i++;
            }
            while (j >= i + 1 && arr[j].compareTo(key) > 0) {
                j--;
            }
            if (i > j) {
                break;
            }
            swap(arr, i++, j--);
        }
        swap(arr, p, j);
        return j;
    }


    private static void swap(Object[] arr, int i, int j) {
        Object objTmp = arr[i];
        arr[i] = arr[j];
        arr[j] = objTmp;
    }
}
