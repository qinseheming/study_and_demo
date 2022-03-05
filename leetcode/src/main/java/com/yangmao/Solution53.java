package com.yangmao;

import java.util.Arrays;
import java.util.Stack;

/**
 * 20. 有效的括号 https://leetcode-cn.com/problems/valid-parentheses/
 *
 */
public class Solution53 {

    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                continue;
            }
            if (nums[i - 1] > 0) {
                nums[i] = nums[i - 1] + nums[i];
            }
        }
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        Solution53 solution53 = new Solution53();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution53.maxSubArray(nums));
    }
}
