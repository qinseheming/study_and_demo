package com.yangmao;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yang
 */
public class Solution1431 {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxNumber = 0;
        for (int candy : candies) {
            if (candy > maxNumber) {
                maxNumber = candy;
            }
        }
        for (int candy : candies) {
            if (candy + extraCandies >= maxNumber) {
                result.add(Boolean.TRUE);
            } else {
                result.add(Boolean.FALSE);
            }
        }
        return result;
    }
}
