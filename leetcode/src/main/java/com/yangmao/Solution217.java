package com.yangmao;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author yang
 */
public class Solution217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        if (set.size() != nums.length) {
            return true;
        }
        return false;
    }



}
