package com.yangmao;

/**
 * 1108. IP 地址无效化 https://leetcode-cn.com/problems/defanging-an-ip-address/
 *
 * @author yangming
 * @date 2019/10/29
 */
public class Solution1108 {

    public static String defangIPaddr1(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    public static String defangIPaddr2(String address) {
        return address.replace(".", "[.]");
    }

    public static String defangIPaddr3(String address) {
        String[] split = address.split("\\.");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            sb.append(split[i]);
            if (i != split.length - 1) {
                sb.append("[.]");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String address = "192.168.1.1";
        System.out.println(defangIPaddr1(address));
        System.out.println(defangIPaddr2(address));
        System.out.println(defangIPaddr3(address));
    }
}
