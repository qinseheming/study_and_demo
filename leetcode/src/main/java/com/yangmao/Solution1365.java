package com.yangmao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangming
 * @date 2020/7/29
 */
public class Solution1365 {

    public int[] smallerNumbersThanCurrent(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < result.length; i++) {

        }
        return result;
    }

}
