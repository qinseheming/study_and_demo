package com.yangmao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author yangming
 * @date 2019/12/3
 */
public class Solution349 {

    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        Map<Integer, Boolean> map = new HashMap<>();
        for (int value : nums1) {
            map.put(value, true);
        }
        for (int value : nums2) {
            if (map.get(value) != null) {
                set.add(value);
            }
        }
        int[] result = new int[set.size()];
        Object[] objects = set.toArray();
        for (int i = 0; i < objects.length; i++) {
            result[i] = (int)objects[i];
        }
        return result;
    }

    public static void main(String[] args) {

    }

}
