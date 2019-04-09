package com.littlefxc.examples.algorithm;

/**
 * @author fengxuechao
 * @date 2019-04-09
 */
public class EncryptionAbout {

    /**
     * 欧几里得算法：求最大公因数
     *
     * @param m
     * @param n
     * @return
     */
    public static long gcd(long m, long n) {
        while (n != 0) {
            long rem = m % n;
            m = n;
            n = rem;
        }
        return m;
    }

    /**
     * TODO 使用BigInteger改写
     * O(2LogN)
     * 高效率的幂运算
     * @param x
     * @param n
     * @return
     */
    public static long pow(long x, int n) {
        if (n == 0)
            return 1;
        if ((n & 1) == 0)//奇数的最后一位总是1
            return pow(x * x, n / 2);
        else
            return pow(x, n -1) * x;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2, 40));
        System.out.println(pow(2,40));
    }
}
