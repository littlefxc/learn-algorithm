package com.littlefxc.examples.algorithm;

import java.math.BigInteger;

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
     * O(2LogN)
     * 高效率的幂运算
     *
     * @param x
     * @param n
     * @return
     */
    public static BigInteger pow(BigInteger x, BigInteger n) {
        if (n.equals(BigInteger.ZERO))
            return BigInteger.ONE;
        if ((n.mod(BigInteger.valueOf(2))).equals(BigInteger.ZERO))
            return pow(x.pow(2), n.divide(BigInteger.valueOf(2)));
        else
            return pow(x, n.subtract(BigInteger.ONE)).multiply(x);
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(2, 400));
        System.out.println(pow(BigInteger.valueOf(2), BigInteger.valueOf(400)));
    }
}
