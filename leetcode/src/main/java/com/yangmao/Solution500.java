package com.yangmao;

import com.yangming.leetcode.util.PrintUtil;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yangming
 * @date 2019/11/29
 */
public class Solution500 {

    public static String[] findWords(String[] words) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('z', 1);
        map.put('x', 1);
        map.put('c', 1);
        map.put('v', 1);
        map.put('b', 1);
        map.put('n', 1);
        map.put('m', 1);

        map.put('a', 2);
        map.put('s', 2);
        map.put('d', 2);
        map.put('f', 2);
        map.put('g', 2);
        map.put('h', 2);
        map.put('j', 2);
        map.put('k', 2);
        map.put('l', 2);

        map.put('q', 3);
        map.put('w', 3);
        map.put('e', 3);
        map.put('r', 3);
        map.put('t', 3);
        map.put('y', 3);
        map.put('u', 3);
        map.put('i', 3);
        map.put('o', 3);
        map.put('p', 3);

        List<String> list = new ArrayList<>();
        for (String word : words) {
            String newWord = word.toLowerCase();
            char charAt = newWord.charAt(0);
            int num = map.get(charAt);
            boolean flag = true;
            for (char c : newWord.toCharArray()) {
                if (num != map.get(c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(word);
            }
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = list.get(i);
        }
        return strArr;
    }

    public static void main(String[] args) {
        String[] words = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        PrintUtil.printArray(findWords(words));
    }
}
