package com.yangmao;

import com.yangming.leetcode.util.PrintUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * 905. 按奇偶排序数组 https://leetcode-cn.com/problems/sort-array-by-parity/
 */
public class Solution905 {
    public static int[] sortArrayByParity(int[] A) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                list1.add(A[i]);
            } else {
                list2.add(A[i]);
            }
        }
        list1.addAll(list2);
        int[] array = new int[A.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = list1.get(i);
        }
        return array;
    }

    public static void main(String[] args) {
        int[] A = new int[]{0};
        PrintUtil.printArray(sortArrayByParity(A));
    }
}
