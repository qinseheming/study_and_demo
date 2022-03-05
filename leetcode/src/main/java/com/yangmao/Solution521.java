package com.yangmao;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author yangming
 * @date 2019/11/29
 */
public class Solution521 {

    public int findLUSlength(String a, String b) {
        if (a.equals(b)) {
            return -1;
        } else {
            return Math.max(a.length(), b.length());
        }
    }

    public static void main(String[] args) {
        String a = "aba";
        String b = "cdca";
        Solution521 solution521 = new Solution521();
        int result = solution521.findLUSlength(a, b);
        System.out.println(result);
    }
}
