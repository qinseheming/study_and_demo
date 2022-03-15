package com.yangmao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int nums1Index = m - 1;
        int nums2Index = n - 1;

        for (int i = nums1.length - 1; i >= 0; i--) {
            if (nums1Index < 0) {
                nums1[i] = nums2[nums2Index];
                nums2Index--;
                continue;
            }
            if (nums2Index < 0) {
                nums1[i] = nums1[nums1Index];
                nums1Index--;
                continue;
            }
            if (nums1[nums1Index] > nums2[nums2Index]) {
                nums1[i] = nums1[nums1Index];
                nums1Index--;
            } else {
                nums1[i] = nums2[nums2Index];
                nums2Index--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        int m = 0;
        int n = 1;

        Solution88 solution88 = new Solution88();

        solution88.merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.println(i);
        }
    }

}
