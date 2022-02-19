package com.yangmao.single;

/**
 * 双重检查锁
 * @author yangming
 * @date 2020/6/7
 */
public class Singleton3 {

    /**
     * 需要加volatile防止指令重排序
     */
    private static volatile Singleton3 instance;

    private Singleton3() {
    }

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
