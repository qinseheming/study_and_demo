package com.yangmao;

/**
 * @author yangming
 * @date 2019/11/29
 */
public class Solution70 {
    public static int count(int n) {
        if (n < 3) {
            return n;
        }
        int left = 1;
        int right = 2;
        for (int i = 2; i < n; i++) {
            int temp = left + right;
            left = right;
            right = temp;
        }
        return right;
    }

    public static void main(String[] args) {
        int count = count(10);
        System.out.println(count);
    }

}
