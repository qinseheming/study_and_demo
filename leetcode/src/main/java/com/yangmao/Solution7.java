package com.yangmao;

/**
 * 7. 整数反转 https://leetcode-cn.com/problems/reverse-integer/
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Solution7 {

    /**
     * 第一种方法：
     *      如果输入数字为正数，将数字转换为字符串再转换为char[] 反转输出
     *      如果
     * @param x
     * @return
     */
    public static int reverse(int x) {
        String str = x + "";
        StringBuilder sb = new StringBuilder();
        if (x > 0) {
            char[] chars = str.toCharArray();
            for (int i = chars.length - 1; i >= 0; i--) {
                sb.append(chars[i]);
            }
        } else {
            sb = new StringBuilder(str);
            sb = sb.reverse();
            sb = sb.insert(0, "-");
            sb = sb.deleteCharAt(sb.length() - 1);
        }
        try {
            long l = Long.parseLong(sb.toString());
            x = (int) l;
        } catch (NumberFormatException e) {
            return 0;
        }
        return x;
    }

    public static void main(String[] args) {
        int x = 1534236469;
        System.out.println(reverse(x));
    }
}
