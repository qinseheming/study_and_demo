package com.yangmao;

/**
 * @author yangming
 * @date 2020/7/28
 */
public class Solution1528 {

    public String restoreString(String s, int[] indices) {
        char[] chars = s.toCharArray();
        char[] result = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            result[i] = chars[indices[i]];
        }
        return new String(result);
    }
}
