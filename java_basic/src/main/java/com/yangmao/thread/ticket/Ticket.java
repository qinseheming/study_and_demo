package com.yangmao.thread.ticket;

/**
 * @author yangming
 * @date 2020/6/7
 */
public class Ticket extends Thread{

    private static int ticketNum = 10;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (Ticket.class) {
                if (ticketNum > 0) {
                    System.out.println(Thread.currentThread().getName() + "正在卖第" + ticketNum-- + "张票");
                }
            }
        }
    }
}
