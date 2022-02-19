package com.yangmao.lcn;

/**
 * @author yangming
 * @date 2020/7/28
 */
public class Solution06 {

    public int minCount(int[] coins) {
        int result = 0;
        for (int coin : coins) {
            if (coin % 2 == 0) {
                result += coin / 2;
            } else {
                result += coin / 2 + 1;
            }
        }
        return result;
    }
}
