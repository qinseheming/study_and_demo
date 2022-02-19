package com.yangmao;

import java.util.Arrays;

/**
 * 561. 数组拆分 I https://leetcode-cn.com/problems/array-partition-i/
 *
 */
public class Solution561 {

    public static int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        int n = nums.length / 2;
        for (int i = 0; i < nums.length; i+=2) {
            result += nums[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,4,3,2};
        System.out.println(arrayPairSum(nums));
    }
}
