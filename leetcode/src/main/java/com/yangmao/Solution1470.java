package com.yangmao;

/**
 * @author yang
 */
public class Solution1470 {

    /**
     * [x1,x2,x3,x4,y1,y2,y3,y4]
     * [x1,y1,x3,x4,x2,y2,y3,y4]
     * [x1,y1,x2,y2,x3,x4,y3,y4]
     * [x1,y1,x2,y2,x3,y3,x4,y4]
     *
     * @param nums
     * @param n
     * @return
     */
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        for (int i = 0; i < nums.length; i += 2) {
            result[i] = nums[i / 2];
        }
        for (int i = 1, j = n + 1; i < nums.length; i += 2, n++) {
            result[i] = nums[n];
        }
        return result;
    }
}
