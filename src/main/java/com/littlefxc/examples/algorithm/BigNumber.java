package com.littlefxc.examples.algorithm;

/**
 * 两个非常大的数字（超过Long最大能表达的范围）的加法运算（不用BigInteger）
 *
 * @author fengxuechao
 */
public class BigNumber {

    public static void main(String[] args) {
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Long.MAX_VALUE + 2 = " + Long.sum(Long.MAX_VALUE, 2L));
        System.out.println("BigNumber.add(Long.MAX_VALUE,2) = " + BigNumber.sum("1", String.valueOf(Long.MAX_VALUE)));
    }

    /**
     * 加法
     * @param a
     * @param b
     * @return
     */
    public static String sum(String a, String b) {
        String max = a.length() >= b.length() ? a : b;
        String min = a.length() < b.length() ? a : b;
        int maxLen = Integer.max(a.length(), b.length());
        int minLen = Integer.min(a.length(), b.length());
        int[] maxArr = new int[maxLen];
        int[] minArr = new int[maxLen];
        for (int i = 0; i < maxLen; i++) {
            maxArr[i] = Integer.parseInt(String.valueOf(max.charAt(i)));
        }
        for (int j = 0; j < minLen; j++) {
            if (j < maxLen - minLen) {
                minArr[j] = 0;
            }
            minArr[j + maxLen - minLen] = Integer.parseInt(String.valueOf(min.charAt(j)));
        }
        return calculate(maxArr, minArr);
    }

    private static String calculate(int[] m, int[] n) {
        int[] result = new int[m.length >= n.length ? m.length : n.length];
        for (int i = 0; i < n.length; i++) {
            result[i] = m[i] + n[i];
        }
        StringBuilder sb = new StringBuilder();
        for (int i = n.length - 1; i >= 1; i--) {
            if (result[i] >= 10) {
                result[i - 1] += 1;
                result[i] -= 10;
            }
            sb.append(result[i]);
        }
        if (result[0] >= 10) {
            sb.append(result[0] - 10).append("1");
        } else {
            sb.append(result[0]);
        }
        return sb.reverse().toString();
    }

}