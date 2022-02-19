package com.yangmao;

import java.util.HashMap;
import java.util.Map;

/**
 * 771. 宝石与石头 https://leetcode-cn.com/problems/jewels-and-stones/
 *
 * @author yangming
 * @date 2019/10/28
 */
public class Solution771 {

    public static int numJewelsInStones(String J, String S) {
        char[] chars = J.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        int num = 0;
        for (Character character : chars) {
            map.put(character, 1);
        }
        char[] stoneChars = S.toCharArray();
        for (Character character : stoneChars) {
            Integer isExist = map.get(character);
            if (isExist != null) {
                num++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        String J = "z";
        String S = "ZZ";
        System.out.println(numJewelsInStones(J, S));
    }
}
