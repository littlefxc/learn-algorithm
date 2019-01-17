package com.littlefxc.examples.algorithm;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/**
 * 测试选择排序
 *
 * @author fengxuechao
 * @date 2019/1/17
 **/
public class SelectionSortTest {

    private Integer[] randomInt;

    @Before
    public void setUp() {
        int n = 100000;
        randomInt = new Integer[n];
        Random random = new Random();
        for (int i = 0; i < n; i++){
            randomInt[i] = random.nextInt(n);
        }
    }

    @Test
    public void sort() {
        long before = System.currentTimeMillis();
        SelectionSort.sort(randomInt);
        long after = System.currentTimeMillis();
        System.out.println("耗时（s）" + TimeUnit.MILLISECONDS.toSeconds(after-before));
        System.out.println(Arrays.asList(randomInt));
    }
}