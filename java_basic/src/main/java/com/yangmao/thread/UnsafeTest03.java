package com.yangmao.thread;

/**
 * 模拟抢票的线程不安全操作
 */
public class UnsafeTest03 {
    public static void main(String[] args) {
        UnsafeWeb12306 u1 = new UnsafeWeb12306();
        Thread thread1 = new Thread(u1, "u1");
        Thread thread2 = new Thread(u1, "u2");
        Thread thread3 = new Thread(u1, "u3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class UnsafeWeb12306 implements Runnable{
    private int ticketNum = 10;

    @Override
    public void run() {
        while (true) {
            if (ticketNum < 0) {
                return;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "==>" + ticketNum--);
        }
    }
}