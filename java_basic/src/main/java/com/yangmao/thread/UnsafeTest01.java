package com.yangmao.thread;

import java.util.ArrayList;
import java.util.List;

/**
 * 多线程操作容器时会出现问题
 */
public class UnsafeTest01 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            new Thread(() -> {
                list.add(Thread.currentThread().getName());
            }).start();
        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(list.size());
    }
}
