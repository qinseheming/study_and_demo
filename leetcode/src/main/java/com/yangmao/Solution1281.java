package com.yangmao;

/**
 * @author yangming
 * @date 2019/12/13
 */
public class Solution1281 {

    public static int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n % 10 != 0) {
            int ele = n % 10;
            n = n / 10;
            product *= ele;
            sum += ele;
        }
        return product - sum;
    }

    public static void main(String[] args) {
        int n = 4421;
        System.out.println(subtractProductAndSum(n));
    }
}
