package com.yangmao.single;

/**
 * 静态内部类实现单例
 *
 * @author 75442
 */
public class Singleton4 {

    private Singleton4() {
    }

    public static Singleton4 getInstance() {
        return InnerClass.INSTANCE;
    }

    static class InnerClass {
        public static final Singleton4 INSTANCE = new Singleton4();
    }
}
