package com.yangmao;

/**
 * @author yangming
 * @date 2020/1/14
 */
public class Solution1295 {

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            int position = 1;
            while (num / 10 != 0) {
                num = num / 10;
                position++;
            }
            if (position % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
