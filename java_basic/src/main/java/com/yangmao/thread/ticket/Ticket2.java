package com.yangmao.thread.ticket;

/**
 * @author yangming
 * @date 2020/6/7
 */
public class Ticket2 implements Runnable {
    private int ticketNum = 100;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            this.saleTicket();
        }
    }

    public synchronized void saleTicket() {
        if (ticketNum > 0) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + "正在卖第" + ticketNum-- + "张票");
        }
    }
}
