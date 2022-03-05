package com.yangmao;

import com.yangmao.util.PrintUtil;

/**
 * @author yangming
 * @date 2019/12/20
 */
public class Solution27 {

    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }


    public static void main(String[] args) {
        int[] arr = new int[]{3, 2, 2, 3};
        int val = 2;
        System.out.println(removeElement(arr, val));
        PrintUtil.printArray(arr);
    }
}
