package com.littlefxc.examples.algorithm;

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

    // 构造函数, 通过一个给定数组创建一个最大堆
    // 该构造堆的过程, 时间复杂度为O(n)
    public MaxHeap(T arr[]) {

        int n = arr.length;

        data = (T[]) new Comparable[n + 1];
        capacity = n;

        for (int i = 0; i < n; i++) {
            data[i + 1] = arr[i];
        }
        count = n;

        for (int i = count / 2; i >= 1; i--) {
            shiftDown(i);
        }
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

        data[count + 1] = t;
        count++;
        shiftUp(count);
    }

    public T extractMax() {
        assert count > 0;
        T ret = data[1];
        swap(1, count);
        count--;
        shiftDown(1);
        return ret;
    }

    private void shiftDown(int k){

        while( 2*k <= count ){
            int j = 2*k; // 在此轮循环中,data[k]和data[j]交换位置
            if( j+1 <= count && data[j+1].compareTo(data[j]) > 0 ) {
                j++;
                // data[j] 是 data[2*k]和data[2*k+1]中的最大值
            }
            if( data[k].compareTo(data[j]) >= 0 ) {
                break;
            }
            swap(k, j);
            k = j;
        }
    }

    private void shiftUp(int k){

        while( k > 1 && data[k/2].compareTo(data[k]) < 0 ){
            swap(k, k/2);
            k /= 2;
        }
    }

    /**
     * todo 优化：可以用赋值法取代交换法
     *
     * @param i
     * @param j
     */
    private void swap(int i, int j) {
        T tmp = data[i];
        data[i] = data[j];
        data[j] = tmp;
    }

}
