package com.yangmao;

import java.util.Stack;

/**
 * 20. 有效的括号 https://leetcode-cn.com/problems/valid-parentheses/
 *
 */
public class Solution20 {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char sign = s.charAt(i);
            if (sign == '(' || sign == '[' || sign == '{') {
                stack.push(sign);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (sign == ')') {
                    if (left != '(') {
                        return false;
                    }
                } else if (sign == ']') {
                    if (left != '[') {
                        return false;
                    }
                } else if (sign == '}') {
                    if (left != '{') {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "{[]}";
        System.out.println(isValid(str));
    }
}
