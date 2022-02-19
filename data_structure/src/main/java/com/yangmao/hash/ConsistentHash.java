package com.yangmao.hash;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 * 一致性hash
 * 实现:
 * 设置一个0 - (2^32 - 1)的hash环
 * 对服务器ip进行hash使其落到hash环上，保存服务器hash和ip的映射
 * 当客户端请求时，对客户端ip进行hash，顺时针从hash环中找出最近的服务器ip
 *
 * @author yangming
 * @date 2021/12/18
 */
public class ConsistentHash {

    public static void main(String[] args) {
        // 定义服务端ip
        String[] serviceIPs = new String[]{"127.0.0.1", "39.106.73.19", "39.106.3.93"};
        // 定义客户端ip
        String[] clientIPs = new String[]{"223.70.174.202", "36.56.3.4", "36.56.3.5"};

        SortedMap<Integer, String> serviceMap = new TreeMap<>();

        for (String serviceIP : serviceIPs) {
            int hash = Math.abs(serviceIP.hashCode());
            serviceMap.put(hash, serviceIP);
        }

        for (String clientIP : clientIPs) {
            int hash = Math.abs(clientIP.hashCode());
            SortedMap<Integer, String> integerStringSortedMap = serviceMap.tailMap(hash);
            String serviceIP;
            if (integerStringSortedMap.isEmpty()) {
                Integer firstKey = serviceMap.firstKey();
                serviceIP = serviceMap.get(firstKey);
            } else {
                Integer firstKey = integerStringSortedMap.firstKey();
                serviceIP = integerStringSortedMap.get(firstKey);
            }
            System.out.println("客户端IP: " + clientIP + "被路由到: " + serviceIP + "服务器上");
        }
    }

}
