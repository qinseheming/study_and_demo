package com.yangmao;

/**
 * LCP 1. 猜数字 https://leetcode-cn.com/problems/guess-numbers/
 *
 * @author yangming
 * @date 2019/10/28
 */
public class SolutionLCP1 {

    public static int game(int[] guess, int[] answer) {
        int length = 3;
        int successNum = 0;
        for (int i = 0; i < length; i++) {
            if (guess[i] == answer[i]) {
                successNum++;
            }
        }
        return successNum;
    }

    public static void main(String[] args) {
        int[] guess = new int[]{2,2,3};
        int[] answer = new int[]{3,2,1};
        System.out.println(game(guess, answer));
    }
}
