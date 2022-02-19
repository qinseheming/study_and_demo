package com.yangmao.thread;

/**
 * @author yangming
 * @date 2020/6/7
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("重写run方法");
    }
}
