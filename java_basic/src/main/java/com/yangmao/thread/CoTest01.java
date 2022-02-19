package com.yangmao.thread;


/**
 * 管程法实现线程通信
 */
public class CoTest01 {
    public static void main(String[] args) {
        SynContainer container = new SynContainer();
        Product product = new Product(container);
        Consumer consumer = new Consumer(container);
        new Thread(product).start();
        new Thread(consumer).start();
    }

}

class Product implements Runnable{
    SynContainer container;

    public Product(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.push(new SteamedBun(i));
        }
    }
}

class Consumer implements Runnable {
    SynContainer container;

    public Consumer(SynContainer container) {
        this.container = container;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            container.pop();
        }
    }
}

/**
 * 缓冲区
 */
class SynContainer {
    SteamedBun[] buns = new SteamedBun[10];
    int index;

    public synchronized void push(SteamedBun steamedBun) {
        if (index == buns.length) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        buns[index] = steamedBun;
        index++;
        System.out.println("生产者放入了第" + steamedBun.getId() + "个馒头");
        this.notifyAll();
    }

    public synchronized SteamedBun pop() {
        if (index == 0) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        index--;
        SteamedBun steamedBun = buns[index];
        System.out.println("消费者取出了第" + steamedBun.getId() + "个馒头");
        this.notifyAll();
        return steamedBun;
    }
}

/**
 * 馒头
 */
class SteamedBun {
    private int id;

    public SteamedBun(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
