package com.yangmao;


import com.yangmao.util.PrintUtil;

/**
 * 942. 增减字符串匹配 https://leetcode-cn.com/problems/di-string-match/
 *
 * @author yangming
 * @date 2019/11/8
 */
public class Solution942 {

    public static int[] diStringMatch(String S) {
        int[] arr = new int[S.length() + 1];
        int start = 0;
        int end = S.length();
        for (int index = 0; index < S.toCharArray().length; index++) {
            char c = S.charAt(index);
            if (c == 'I') {
                arr[index] = start++;
            } else {
                arr[index] = end--;
            }
        }
        arr[S.length()] = start;
        return arr;
    }

    public static void main(String[] args) {
        String S = "I";
        int[] ints = diStringMatch(S);
        PrintUtil.printArray(ints);
    }

}
