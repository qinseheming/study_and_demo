package com.yangmao;

import java.util.Arrays;

/**
 * 1051 高度检查器 https://leetcode-cn.com/problems/height-checker/
 * @author yangming
 * @date 2019/11/5
 */
public class Solution1051 {

    public static int heightChecker(int[] heights) {
        int result = 0;
        int[] copy = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            copy[i] = heights[i];
        }
        Arrays.sort(copy);
        for (int i = 0; i < heights.length; i++) {
            if (copy[i] != heights[i]) {
                result ++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] heights = new int[]{1,1,1,1,1,1,1,1};
        System.out.println(heightChecker(heights));
    }
}
