package com.yangmao;


import com.yangmao.util.PrintUtil;

/**
 * @author yangming
 * @date 2019/12/13
 */
public class Solution189 {

    public static void rotate(int[] nums, int k) {
        while (k != 0) {
            int temp = nums[nums.length - 1];
            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            k--;
        }
    }

    public static void rotate2(int[] nums, int k) {
        k = k % nums.length;

        int start = k;
        for (int i = 0; i < nums.length; i += k) {
            int temp = nums[i];
            nums[k] = temp;
            k = k + k;
        }

        int temp = nums[nums.length - 1];
        for (int i = nums.length - k; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{-1, -100, 3, 99};
        int k = 2;
        rotate(nums, k);
        PrintUtil.printArray(nums);
    }
}
