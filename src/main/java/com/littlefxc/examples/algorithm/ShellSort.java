package com.littlefxc.examples.algorithm;

/**
 * 希尔排序
 * 希尔排序是把记录按下标的一定增量分组，对每组使用直接插入排序算法排序；随着增量逐渐减少，每组包含的关键词越来越多，当增量减至1时，整个文件恰被分成一组，算法便终止。
 *
 * @author fengxuechao
 * @date 2019/2/1
 **/
public class ShellSort {

    private ShellSort() {
    }

    /**
     * 从综合效率上考量选择移动法希尔排序
     * @param arr
     */
    public static void sort(Comparable[] arr) {
//        sort1(arr);
        sort2(arr);
    }

    /**
     * 交换法
     *
     * @param arr
     */
    public static void sort1(Comparable[] arr) {
        // 增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            //从第gap个元素，逐个对其所在组进行直接插入排序操作
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                while (j - gap >= 0 && arr[j].compareTo(arr[j - gap]) < 0) {
                    // 插入排序采用交换法
                    swap(arr, j, j - gap);
                    j -= gap;
                }
            }
        }
    }

    /**
     * 移动法
     *
     * @param arr
     */
    public static void sort2(Comparable[] arr) {
        // 增量gap，并逐步缩小增量
        for (int gap = arr.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < arr.length; i++) {
                int j = i;
                Comparable key = arr[j];
                while (j - gap >= 0 && arr[j - gap].compareTo(key) > 0) {
                    arr[j - gap] = arr[j];
                    j -= gap;
                }
                arr[j] = key;
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
