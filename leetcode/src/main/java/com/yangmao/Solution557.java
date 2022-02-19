package com.yangmao;

import java.util.Stack;

/**
 * 557. 反转字符串中的单词 III https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * @author yangming
 * @date 2019/11/8
 */
public class Solution557 {

    public static String reverseWords(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder builder = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c != ' ') {
                stack.push(c);
            } else {
                while (!stack.isEmpty()) {
                    builder.append(stack.pop());
                }
                builder.append(" ");
            }
        }
        while (!stack.isEmpty()) {
            builder.append(stack.pop());
        }
        return builder.toString();
    }

    public static String reverseWords2(String s) {
        String[] s1 = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (String s2 : s1) {
            builder.append(new StringBuilder(s2).reverse().toString());
            builder.append(" ");
        }
        return builder.deleteCharAt(builder.lastIndexOf(" ")).toString();
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords2(s));
    }
}
