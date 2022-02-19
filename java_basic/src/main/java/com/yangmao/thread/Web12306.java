package com.yangmao.thread;

public class Web12306 implements Runnable {

    private int ticket = 99;
    @Override
    public void run() {
        while (ticket >= 0) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "-->" + ticket--);
        }
    }

    public static void main(String[] args) {
        Web12306 web = new Web12306();
        Thread t = new Thread(web, "1");
        t.start();
    }
}
