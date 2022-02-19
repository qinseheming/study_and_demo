package com.yangmao;


import java.util.Stack;

/**
 * 1221. 分割平衡字符串 https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
 * @author yangming
 * @date 2019/10/31
 */
public class Solution1221 {

    // 贪心算法
    public static int balancedStringSplit3(String s) {
        int result = 0;
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L') {
                num ++;
            } else {
                num --;
            }
            if (num == 0) {
                result++;
            }
        }
        return result;
    }

    public static int balancedStringSplit(String s) {
        int result = 0;
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            char c = chars[i];
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }
            Character first = stack.firstElement();
            if (first == c) {
                stack.push(c);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    result++;
                }
            }
        }
        return result;
    }

    // 这种方法要快一点
    public static int balancedStringSplit2(String s) {
        int result = 0;
        char left = 0;
        int leftNum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (leftNum == 0) {
                left = c;
                leftNum ++;
                continue;
            }
            if (c == left) {
                leftNum ++;
            } else {
                leftNum --;
                if (leftNum == 0) {
                    result ++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        System.out.println(balancedStringSplit2(s));
    }
}
