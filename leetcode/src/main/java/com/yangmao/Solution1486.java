package com.yangmao;

/**
 * @author yangming
 * @date 2020/6/30
 */
public class Solution1486 {

    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2 * i;
        }
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

}
