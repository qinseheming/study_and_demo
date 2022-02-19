package com.yangmao.single;

import java.util.concurrent.CountDownLatch;

/**
 * 测试多线程环境下各种创建单例的效率
 *
 * @author 75442
 */
public class Client2 {

    public static void main(String[] args) throws InterruptedException {
        int threadNum = 10;
        long start = System.currentTimeMillis();
        CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        for (int i = 0; i < threadNum; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000000; j++) {
                    Object object = Singleton3.getInstance();
                }
                countDownLatch.countDown();
            }).start();
        }
        countDownLatch.await();
        System.out.println(System.currentTimeMillis() - start);
    }
}
