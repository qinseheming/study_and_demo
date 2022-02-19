package com.yangmao.thread;

/**
 * 模拟死锁
 */
public class DealLock {
    public static void main(String[] args) {
        Makeup m1 = new Makeup(1, "大丫");
        Makeup m2 = new Makeup(2, "小丫");
        new Thread(m1).start();
        new Thread(m2).start();

    }
}

class Mirror {

}

class Lipstick {

}

class Makeup implements Runnable{

    static Mirror mirror = new Mirror();
    static Lipstick lipstick = new Lipstick();

    private int choice;
    private String name;

    public Makeup(int choice, String name) {
        this.choice = choice;
        this.name = name;
    }

    @Override
    public void run() {
        makeup();
    }

    public void makeup() {
        if (this.choice == 1) {
            synchronized (mirror) {
                System.out.println(this.name + "照镜子");
            }
            synchronized (lipstick) {
                System.out.println(this.name + "涂口红");
            }
        } else {
            synchronized (lipstick) {
                System.out.println(this.name + "涂口红");
            }
            synchronized (mirror) {
                System.out.println(this.name + "照镜子");
            }
        }
    }
}








