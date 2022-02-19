package com.yangmao;

/**
 * 3. 无重复字符的最长子串 https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * @author : yangming
 * @date : 2019/9/23
 */
public class Solution3 {

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int maxSubStrLength = 0;
        char[] chars = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            int index = sb.indexOf(chars[i] + "");
            if (index != -1) {
                sb.delete(0, index + 1);
            }
            sb.append(chars[i]);
            maxSubStrLength = Math.max(maxSubStrLength, sb.length());
        }
        return maxSubStrLength;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }

}
