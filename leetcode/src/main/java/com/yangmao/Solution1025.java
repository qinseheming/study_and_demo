package com.yangmao;

/**
 * @author yangming
 * @date 2019/12/19
 */
public class Solution1025 {

    public static boolean divisorGame(int N) {
        if (N % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 2;
        System.out.println(divisorGame(num));
    }

}
