package com.yangmao;


import java.util.Stack;

/**
 * 1021. 删除最外层的括号 https://leetcode-cn.com/problems/remove-outermost-parentheses/
 *
 * @author yangming
 * @date 2019/11/1
 */
public class Solution1021 {

    public static String removeOuterParentheses(String S) {
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else {
                stack.pop();
            }
            sb.append(c);
            if (stack.isEmpty()) {
                result.append(sb.toString(), 1, sb.length() - 1);
                sb.delete(0, sb.length());
            }
        }
        return result.toString();
    }

    public static String removeOuterParentheses2(String S) {
        StringBuilder result = new StringBuilder();
        int leftIndex = 0;
        int rightIndex = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                if (stack.isEmpty()) {
                    leftIndex = i;
                }
                stack.push(c);
            } else {
                stack.pop();

            }
            if (stack.isEmpty()) {
                rightIndex = i;
                result.append(S, leftIndex + 1, rightIndex);
            }
        }
        return result.toString();
    }

    public static String removeOuterParentheses3(String S) {
        StringBuilder result = new StringBuilder();
        int leftIndex = 0;
        int index = 0;
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                leftIndex++;
            } else {
                leftIndex--;
            }
            if (leftIndex == 1 && c == '(') {
                index = i;
            }
            if (leftIndex == 0) {
                result.append(S, index + 1, i);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = "()()";
        System.out.println(removeOuterParentheses3(str));
    }
}
