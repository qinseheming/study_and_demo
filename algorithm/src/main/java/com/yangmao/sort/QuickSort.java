package com.yangmao.sort;

import java.util.Random;

/**
 * @author yangming
 * @date 2021/8/15
 */
public class QuickSort {

    private static final Random random = new Random();

    public void quickSort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    public void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int pIndex = partition(nums, left, right);
        quickSort(nums, left, pIndex - 1);
        quickSort(nums, pIndex + 1, right);
    }

    public int partition(int[] nums, int left, int right) {
        int randomIndex = left + random.nextInt(right - left + 1);
        swap(nums, randomIndex, left);

        int point = nums[left];
        int j = left;

        for (int i = left + 1; i <= right; i++) {
            if (nums[i] < point) {
                j++;
                swap(nums, j, i);
            }
        }
        swap(nums, left, j);
        return j;
    }

    public void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{4,7,1,5,8,12,6,2,4};
        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.print(i + ", ");
        }
    }

}
