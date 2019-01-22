package com.littlefxc.examples.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSort2Test {

    @Test
    public void sort() {
        int N = 50000;
        Integer[] arr1 = SortTestHelper.generateRandomArray(N, 0, 50000);
        Integer[] arr2 = Arrays.copyOf(arr1, arr1.length);
        System.out.println("完全无序的数组排序");
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.MergeSort", "sort", arr1);
        SortTestHelper.testSort("com.littlefxc.examples.algorithm.MergeSort2", "sort", arr2);
    }

}