package com.yangmao;

/**
 * 709. 转换成小写字母 https://leetcode-cn.com/problems/to-lower-case/
 *
 * @author yangming
 * @date 2019/11/1
 */
public class Solution709 {

    public static String toLowerCase(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c += 32;
            }
            builder.append(c);
        }
        return builder.toString();
    }

    public static String toLowerCase2(String str) {
        return str.toLowerCase();
    }

    public static void main(String[] args) {
        String str = "al&phaBET";
        System.out.println(toLowerCase(str));
    }
}
