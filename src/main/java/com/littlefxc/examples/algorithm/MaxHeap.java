package com.littlefxc.examples.algorithm;

import java.util.Random;

/**
 * 最大堆
 *
 * @author fengxuechao
 * @date 2019-02-19
 */
public class MaxHeap<T extends Comparable> {

    protected T[] data;

    protected int count;

    protected int capacity;

    public MaxHeap(int capacity) {
        data = (T[]) new Comparable[capacity + 1];
        count = 0;
        this.capacity = capacity;
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void insert(T t) {
        /* 这步更好的解决办法是扩容，这里是为了简单起见 */
        assert capacity + 1 <= capacity;

        data[++count] = t;
        shiftUp(count);
    }

    public T extractMax() {
        assert count > 0;
        T ret = data[1];
        swap(1, count--);
        shiftDown(1);
        return ret;
    }

    private void shiftDown(int p) {
        while (2 * p < count) {
            // 此轮循环中，data[p] 和 data[l] 交换位置
            int l = 2 * p;
            if (l + 1 <= count && data[l + 1].compareTo(data[l]) >= 0) {
                l++;
            }
            if (data[p].compareTo(data[l])>=0) {
                break;
            }
            swap(p, l);
            p = l;
        }
    }

    private void shiftUp(int index) {
        // 索引为1时，该节点是整个完全二叉树的根结点
        while (index > 1 && data[index / 2].compareTo(data[index]) < 0) {
            swap(index / 2, index);
            index /= 2;
        }
    }

    /**
     * todo 优化：可以用赋值法取代交换法
     * @param i
     * @param j
     */
    private void swap(int i, int j) {
        T tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

}
