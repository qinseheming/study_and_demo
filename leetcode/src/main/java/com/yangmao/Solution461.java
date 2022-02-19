package com.yangmao;

/**
 * 461. 汉明距离 https://leetcode-cn.com/problems/hamming-distance/
 *
 * @author yangming
 * @date 2019/11/2
 */
public class Solution461 {

    public static int hammingDistance(int x, int y) {
        int result = 0;
        int num = x ^ y;
        String s = Integer.toBinaryString(num);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                result ++;
            }
        }
        return result;
    }

    public static int hammingDistance2(int x, int y) {
        return Integer.bitCount(x ^ y);
    }

    // 效率最高
    public static int hammingDistance3(int x, int y) {
        int result = 0;
        while (x != 0 || y != 0) {
            if ((x & 1) != (y & 1)) {
                result++;
            }
            x = x >> 1;
            y = y >> 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 4;
        System.out.println(hammingDistance(x, y));
        System.out.println(hammingDistance2(x, y));
        System.out.println(hammingDistance3(x, y));
    }
}
