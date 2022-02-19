package com.yangmao.thread.ticket;

/**
 * @author yangming
 * @date 2020/6/7
 */
public class Main {

    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        t1.start();
        t2.start();
        t3.start();
    }

    public static void test2() {
        Ticket2 ticket2 = new Ticket2();
        Thread t1 = new Thread(ticket2);
        Thread t2 = new Thread(ticket2);
        Thread t3 = new Thread(ticket2);
        t1.start();
        t2.start();
        t3.start();
    }
}
