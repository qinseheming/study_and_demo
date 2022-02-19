package com.yangmao.single;

/**
 * 枚举方式实现单例
 *
 * @author 75442
 */
public enum Singleton5 {
    /**
     * 实例
     */
    INSTANCE;

    public static Singleton5 getInstance() {
        return INSTANCE;
    }
}
