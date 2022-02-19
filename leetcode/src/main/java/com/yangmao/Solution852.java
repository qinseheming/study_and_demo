package com.yangmao;

/**
 * @author yangming
 * @date 2019/11/29
 */
public class Solution852 {

    public static int peakIndexInMountainArray(int[] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[i + 1]) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{0,2,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }

}
