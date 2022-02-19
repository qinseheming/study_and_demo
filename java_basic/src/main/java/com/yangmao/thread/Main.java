package com.yangmao.thread;

/**
 * @author yangming
 * @date 2020/6/7
 */
public class Main {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("主线程输出");
    }
}
