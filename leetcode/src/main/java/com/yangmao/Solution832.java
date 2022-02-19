package com.yangmao;

/**
 * 832. 翻转图像 https://leetcode-cn.com/problems/flipping-an-image/
 *
 * @author yangming
 * @date 2019/11/3
 */
public class Solution832 {

    public static int[][] flipAndInvertImage(int[][] A) {
        int[][] b = new int[A.length][];

        for (int i = 0; i < A.length; i++) {
            int[] arr = new int[A[i].length];
            int z = 0;
            for (int j = A[i].length - 1; j >= 0; j--) {
                arr[z] = A[i][j] ^ 1;
                z++;
            }
            b[i] = arr;
        }
        return b;
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };
        System.out.println(A);
    }

}
