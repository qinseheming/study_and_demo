package com.yangmao.util;

/**
 * @author yang
 */
public class ArrayUtils {

    public static int[] createInt(String string) {
        String[] split = string.split(",");
        int[] nums = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            nums[i] = Integer.parseInt(split[i]);
        }
        return nums;
    }
}
