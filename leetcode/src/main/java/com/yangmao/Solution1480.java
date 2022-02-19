package com.yangmao;

/**
 * @author yangming
 * @date 2020/6/30
 */
public class Solution1480 {

    public int[] runningSum(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + result;
            result = nums[i];
        }
        return nums;
    }
}
