package com.yangmao;

/**
 * @author yangming
 * @date 2020/7/28
 */
public class Solution2044 {

    public int countMaxOrSubsets(int[] nums) {
        int max = nums[0];
        for (int num : nums) {
            max = max | num;
        }
        int count = 0;


        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1,5};
        Solution2044 solution2044 = new Solution2044();
        System.out.println(solution2044.countMaxOrSubsets(nums));
    }
}
