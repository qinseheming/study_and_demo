package com.yangmao;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和 https://leetcode-cn.com/problems/two-sum/
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 */
public class Solution1 {

    /**
     * 解法1：暴力破解
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int resultA = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (resultA + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum2(nums, target);
        for (int i: result) {
            System.out.println(i);
        }
    }

    /**
     * 解法2： 两遍哈希表
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // 1. map的key存放下标对应的值，value存放下标
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int otherElement = target - nums[i];
            if (map.containsKey(otherElement) && map.get(otherElement) != i) {
                return new int[]{i, map.get(otherElement)};
            }
        }
        return null;
    }


}
