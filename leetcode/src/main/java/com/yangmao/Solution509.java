package com.yangmao;

/**
 * @author yangming
 * @date 2019/12/3
 */
public class Solution509 {

    public static int fib(int N) {
        if (N < 2) {
            return N;
        }
        int[] arr = new int[N];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < N; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[N - 1] + arr[N - 2];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }
}
