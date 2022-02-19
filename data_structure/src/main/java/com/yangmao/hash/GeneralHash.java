package com.yangmao.hash;

/**
 * 普通hash算法实现:
 * 客户端对服务器数量取余
 * 问题：当进行扩容或缩容时会导致大量的请求被路由到与原来不相同的服务器上
 *
 * @author yangming
 * @date 2021/12/18
 */
public class GeneralHash {

    public static void main(String[] args) {
        // 定义客户端IP
        String[] clientIPs = new String[]{"39.106.73.19", "39.106.3.93", "127.0.0.2"};

        // 定义服务器数量
        int serviceCount = 5;

        for (String clientIP : clientIPs) {
            int hashCode = Math.abs(clientIP.hashCode());
            int index = hashCode % serviceCount;
            System.out.println("客户端IP: " + clientIP + "被路由到第" + index + "台服务器上");
        }
    }

}
