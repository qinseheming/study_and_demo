package com.yangmao;

/**
 * @author yangming
 * @date 2020/7/28
 */
public class Solution1512 {

    public int numIdenticalPairs(int[] nums) {
        int result = 0;
        if (nums == null || nums.length <= 0) {
            return result;
        }
        for (int start = 0; start < nums.length; start++) {
            for (int end = start + 1; end < nums.length; end++) {
                if (nums[start] == nums[end]) {
                    result++;
                }
            }
        }
        return result;
    }
}
