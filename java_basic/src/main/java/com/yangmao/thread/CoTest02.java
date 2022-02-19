package com.yangmao.thread;

/**
 * 信号灯法实现线程通信
 */
public class CoTest02 {
    public static void main(String[] args) {
        Tv tv = new Tv();
        Actor actor = new Actor(tv);
        Watcher watcher = new Watcher(tv);
        new Thread(actor).start();
        new Thread(watcher).start();
    }
}

//生产者:演员
class Actor extends Thread{

    Tv tv;

    public Actor(Tv tv) {
        this.tv = tv;
    }

    public void run() {
        //生产
        for(int i=0;i<20;i++) {
            if (i % 2 == 0) {
                tv.play("111");
            } else {
                tv.play("222222");
            }
        }
    }
}

//消费者:观众
class Watcher extends Thread{
    Tv tv;

    public Watcher(Tv tv) {
        this.tv = tv;
    }

    public void run() {
        for(int i=0;i<20;i++) {
            tv.watch();
        }
    }
}

//资源：电视
class Tv{
    String voice;
    boolean flag = true; // 为false时演员等待，观众观看，为true时演员表演，观众等待

    public synchronized void play(String voice) {
        if (!flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("表演了" + voice);
        this.voice = voice;
        this.notifyAll();
        flag = !flag;
    }
    //获取 消费
    public synchronized void watch() {
        if(flag) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        //存在数据可以消费
        System.out.println("观看了" + voice);
        this.notifyAll(); //存在空间了，可以唤醒对方生产了
        flag = !flag;
    }
}

//馒头
class Steamedbun{
    int id;
    public Steamedbun(int id) {
        this.id = id;
    }

}


