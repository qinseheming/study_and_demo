package com.yangmao.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 测试ArrayList和LinkedList的addAll方法哪个更快一些
 *
 * @author : yangming
 * @date : 2019/9/20
 */
public class Test {

    public static void main(String[] args) {
        int capacity = 1000000;
        List<String> list = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++) {
            list.add(i + "");
        }
        long startTime = System.currentTimeMillis();
        List<String> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        System.out.println("arrayList.addAll添加" + capacity + "个数据花费" + (System.currentTimeMillis() - startTime) + "ms");

        startTime = System.currentTimeMillis();
        List<String> linkedList = new LinkedList<>();
        linkedList.addAll(list);
        System.out.println("linkedList.addAll添加" + capacity + "个数据花费" + (System.currentTimeMillis() - startTime) + "ms");
    }
}
