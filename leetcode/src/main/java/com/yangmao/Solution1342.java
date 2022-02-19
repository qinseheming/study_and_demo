package com.yangmao;

/**
 * @author yangming
 * @date 2020/7/28
 */
public class Solution1342 {

    public int numberOfSteps (int num) {
        int stepNum = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num--;
            }
            stepNum++;
        }
        return stepNum;
    }

}
