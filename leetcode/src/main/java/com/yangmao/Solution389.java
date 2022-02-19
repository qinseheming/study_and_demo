package com.yangmao;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangming
 * @date 2019/12/16
 */
public class Solution389 {

    public static char findTheDifference(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer integer = map.get(c);
            if (integer == null) {
                map.put(c, 1);
            } else {
                map.put(c, ++integer);
            }
        }
        for (char c : t.toCharArray()) {
            Integer integer = map.get(c);
            if (integer == null || integer == 0) {
                return c;
            } else {
                map.put(c, --integer);
            }
        }
        return '0';
    }

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));
    }
}
