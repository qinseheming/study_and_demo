package com.yangmao.search;

import java.util.Arrays;

/**
 * 二分法查找
 *
 * @author yangming
 * @date 2020/5/31
 */
public class BinarySearch {

    public static int binarySearch(int[] arrays, int searchElement) {
        int min = 0;
        int max = arrays.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;
            if (searchElement == arrays[mid]) {
                return mid;
            }
            if (searchElement < arrays[mid]) {
                max = mid - 1;
            }
            if (searchElement > arrays[mid]) {
                min = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrays = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(arrays));
        System.out.println(binarySearch(arrays, 9));
    }
}
