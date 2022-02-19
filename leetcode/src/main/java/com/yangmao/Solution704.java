package com.yangmao;

public class Solution704 {

    public static int search(int[] nums, int target) {
        return search(nums, 0, nums.length - 1, target);
    }

    public static int search(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        }
        if (nums[mid] < target) {
            return search(nums, mid + 1, end, target);
        }
        if (nums[mid] > target) {
            return search(nums, start, mid - 1, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5};
        int target = 5;
        System.out.println(search(nums, target));
    }

}
