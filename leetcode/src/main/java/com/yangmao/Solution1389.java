package com.yangmao;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangming
 * @date 2020/7/29
 */
public class Solution1389 {

    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int ind = index[i];
            list.add(ind, nums[i]);
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

}
