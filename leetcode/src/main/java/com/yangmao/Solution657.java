package com.yangmao;

/**
 * 657. 机器人能否返回原点 https://leetcode-cn.com/problems/robot-return-to-origin/
 */
public class Solution657 {

    public static boolean judgeCircle(String moves) {
        if (moves == null || moves.length() == 0) {
            return true;
        }
        int i = 0;
        int j = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'L':
                    i--;
                    break;
                case 'R':
                    i++;
                    break;
                case 'U':
                    j++;
                    break;
                case 'D':
                    j--;
                    break;
                default:
                    break;
            }
        }
        return i == 0 && j == 0;
    }

    public static void main(String[] args) {
        String moves = "UD";
        System.out.println(judgeCircle(moves));
    }
}
