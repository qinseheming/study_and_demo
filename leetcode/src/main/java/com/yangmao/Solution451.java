package com.yangmao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author yangming
 * @date 2019/12/16
 */
public class Solution451 {

    public static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            Integer number = map.get(c);
            if (number == null) {
                map.put(c, 1);
            } else {
                map.put(c, ++number);
            }
        }
        List<Map<Character, Integer>> list = new ArrayList<>();
        Map<Integer, Character> sortMap = new TreeMap<>((o1, o2) -> o2 - o1);
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            sortMap.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<Integer, Character> entry : sortMap.entrySet()) {
            Integer key = entry.getKey();
            Character value = entry.getValue();
            while (key > 0) {
                sb.append(value);
                key--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        String s1 = frequencySort(s);
        System.out.println(s1);
    }
}
