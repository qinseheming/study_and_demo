package com.yangmao;

/**
 * 910. 最小差值 II https://leetcode-cn.com/problems/smallest-range-ii/
 * @author : yangming
 * @date : 2019/9/20
 */
public class Solution910 {

    public static int smallestRangeII(int[] A, int K) {
        int result = 10000;
        int[] b = new int[A.length];
        if (A.length == 1) {
            return 0;
        }
        for (int i = 0; i < A.length - 1; i++) {
            int temp1 = Math.abs((A[i] + K) - (A[i + 1] + K));
            int temp2 = Math.abs((A[i] + K) - (A[i + 1] - K));
            int temp3 = Math.abs((A[i] - K) - (A[i + 1] + K));
            int temp4 = Math.abs((A[i] - K) - (A[i + 1] - K));

            int min = getMin(temp1, temp2, temp3, temp4);
            int temp = Math.abs(b[i] - b[i + 1]);
            result = Math.min(temp, result);
        }
        return result;
    }

    private static int getMin(int temp1, int temp2, int temp3, int temp4) {
        int min = Math.min(temp1, temp2);
        min = Math.min(min, temp3);
        min = Math.min(min, temp4);
        return min;
    }

    public static void main(String[] args) {
        int[] a = new int[]{0, 10};
        int k = 2;
        System.out.println(smallestRangeII(a, k));
    }
}
