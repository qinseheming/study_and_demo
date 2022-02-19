package com.yangmao;

/**
 * 344. 反转字符串 https://leetcode-cn.com/problems/reverse-string/
 */
public class Solution344 {

    public static void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1;
        while (i < j) {
            s[j] = (char) (s[i] ^ s[j]);
            s[i] = (char) (s[i] ^ s[j]);
            s[j] = (char) (s[i] ^ s[j]);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] s = new char[]{'H','a','n','n','a','h'};
        reverseString(s);
        for (char c : s) {
            System.out.println(c);
        }
    }

}
