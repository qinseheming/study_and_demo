package com.yangmao;

import java.util.Arrays;
import java.util.Stack;

/**
 * 20. 有效的括号 https://leetcode-cn.com/problems/valid-parentheses/
 */
public class Solution32 {

    public static int isValid(String s) {
        if (s.length() == 0) {
            return 0;
        }
        Stack<Character> stack = new Stack<>();
        int[] resultArray = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
                if (i == 0) {
                    resultArray[i] = 0;
                } else {
                    resultArray[i] = resultArray[i - 1];
                }
            } else if (s.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    resultArray[i] = 0;
                } else {
                    stack.pop();
                    resultArray[i] = resultArray[i - 1] + 2;
                }
            }
        }
        Arrays.sort(resultArray);
        return resultArray[s.length() - 1];
    }

    public static void main(String[] args) {
        String str = "()(()";
        System.out.println(isValid(str));
    }
}
