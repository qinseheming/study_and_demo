package com.yangmao.sort;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author yangming
 * @date 2020/5/31
 */
public class BubbleSort {

    /**
     * 从小到大排序
     * @param arrays 待排序数组
     */
    public static void bubbleSort(int[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    int swap = arrays[j];
                    arrays[j] = arrays[j + 1];
                    arrays[j + 1] = swap;
                }
            }
        }
    }

    /**
     * 优化冒泡排序
     * @param arrays 待排序数组
     */
    public static void optimizeBubbleSort(int[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            // 如果某一次循环没有发生位置变换，则不需要再排序
            boolean isChange = false;
            for (int j = 0; j < arrays.length - 1 - i; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    arrays[j] = arrays[j] ^ arrays[j + 1];
                    arrays[j + 1] = arrays[j] ^ arrays[j + 1];
                    arrays[j] = arrays[j] ^ arrays[j + 1];
                    isChange = true;
                }
            }
            if (!isChange) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arrays = generateRandomArray(10,100);
        bubbleSort(arrays);
        System.out.println(Arrays.toString(arrays));
        optimizeBubbleSort(arrays);
        System.out.println(Arrays.toString(arrays));
    }

    public static  int[] generateRandomArray(int size,int value){
        //在java中，Math.random() ->double(0,1)
        //(int)((size+1)*Math.random())--->产生的是[0,size]之间的整数
        //生成长度随机的数组，数组的最大长度是size的长度
        int[] arr = new int[(int)((size+1)*Math.random())];
        for(int i = 0 ;i<arr.length;i++){
            //针对数组中的每个值都可以随机一下，一个随机数减去另外一个随机数，可能产生正数，也可能产生负数
            arr[i]=(int)((value+1)*Math.random())-(int)(value*Math.random());//值也可以是随机的
        }
        return arr;
    }
}
