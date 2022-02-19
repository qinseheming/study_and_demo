package com.yangmao;


import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author yangming
 * @date 2020/1/19
 */
public class Solution5315 {

    public static int maximum69Number(int num) {
        Queue<Integer> stack = new ArrayDeque<>();
        int number = num;
        while (num % 10 != 0) {
            stack.add(num % 10);
            num = num / 10;
        }
        if (number > 0) {
            boolean flag = true;
            int b = 1;
            while (!stack.isEmpty()) {
                int a = stack.remove();
                if (flag) {
                    if (a == 6) {
                        a = 9;
                        flag = false;
                    }
                }
                for (int i = 1; i < b; i++) {
                    a = a * 10;
                }
                num = num + a;
                b++;
            }
        } else {
            boolean flag = true;
            int b = 1;
            while (!stack.isEmpty()) {
                int a = stack.remove();
                if (flag) {
                    if (a == -9) {
                        a = -6;
                        flag = false;
                    }
                }
                for (int i = 1; i < b; i++) {
                    a = a * 10;
                }
                num = num + a;
                b++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int num = 9669;
        System.out.println(maximum69Number(num));
    }

}
