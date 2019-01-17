package com.littlefxc.examples.algorithm;

import org.junit.Test;

/**
 * 测试选择排序
 *
 * @author fengxuechao
 * @date 2019/1/17
 **/
public class SelectionSortTest {

    @Test
    public void sort() {
        int N = 20000;
        Integer[] arr = SortTestHelper.generateRandomArray(N, 0, 100000);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.SelectionSort", arr);
    }
}