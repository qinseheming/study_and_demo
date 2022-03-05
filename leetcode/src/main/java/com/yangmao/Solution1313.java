package com.yangmao;


import com.yangmao.util.PrintUtil;

/**
 * @author yangming
 * @date 2020/1/14
 */
public class Solution1313 {

    public static int[] decompressRLElist(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                length += nums[i];
            }
        }
        int index = 0;
        int count = 0;
        int[] result = new int[length];
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                length += nums[i];
                count = nums[i];
            } else {
                while (count > 0) {
                    result[index++] = nums[i];
                    count--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        PrintUtil.printArray(decompressRLElist(nums));
    }
}
