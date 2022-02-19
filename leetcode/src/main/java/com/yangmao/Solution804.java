package com.yangmao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 804. 唯一摩尔斯密码词 https://leetcode-cn.com/problems/unique-morse-code-words/
 *
 * @author yangming
 * @date 2019/11/2
 */
public class Solution804 {

    public static final Map<Character, String> map = new HashMap<>();

    static {
        map.put('a', ".-");
        map.put('b', "-...");
        map.put('c', "-.-.");
        map.put('d', "-..");
        map.put('e', ".");
        map.put('f', "..-.");
        map.put('g', "--.");
        map.put('h', "....");
        map.put('i', "..");
        map.put('j', ".---");
        map.put('k', "-.-");
        map.put('l', ".-..");
        map.put('m', "--");
        map.put('n', "-.");
        map.put('o', "---");
        map.put('p', ".--.");
        map.put('q', "--.-");
        map.put('r', ".-.");
        map.put('s', "...");
        map.put('t', "-");
        map.put('u', "..-");
        map.put('v', "...-");
        map.put('w', ".--");
        map.put('x', "-..-");
        map.put('y', "-.--");
        map.put('z', "--..");
    }

    public static int uniqueMorseRepresentations(String[] words) {
        StringBuilder result = new StringBuilder();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length; i++) {
            String str = words[i];
            for (char c : str.toCharArray()) {
                result.append(map.get(c));
            }
            set.add(result.toString());
            result.delete(0, result.length());
        }
        return set.size();
    }

    public static void main(String[] args) {
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }
}
