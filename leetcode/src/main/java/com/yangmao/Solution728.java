package com.yangmao;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. 自除数 https://leetcode-cn.com/problems/self-dividing-numbers/
 *
 * @author yangming
 * @date 2019/11/7
 */
public class Solution728 {

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++) {
            if (selfDividing(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private static boolean selfDividing(int n) {
        int x = n;
        while (x > 0) {
            int d = x % 10;
            x = x / 10;
            if (d == 0 || n % d != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int left = 1;
        int right = 22;
        System.out.println(selfDividingNumbers(left, right));
    }
}
