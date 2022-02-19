package com.yangmao;

/**
 * @author yangming
 * @date 2019/12/16
 */
public class Solution540 {

    public static int singleNonDuplicate(int[] nums) {
        if (nums.length < 2) {
            return nums[0];
        }
        for (int i = 1; i < nums.length; i+=2) {
            if (nums[i] - nums[i - 1] != 0) {
                return nums[i - 1];
            }
        }
        return nums[nums.length - 1];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 3,3,7,7,11,11, 12,12};
        System.out.println(singleNonDuplicate(nums));
    }
}
