package com.yangmao.single;

/**
 * 饿汉式单例
 *
 * 1. 构造方法私有化
 * 2. 提供一个static的成员变量
 * 3. 提供一个方法获取成员变量
 * @author yangming
 * @date 2020/6/7
 */
public class Singleton1 {

    /**
     * 变量需要加static修饰，使其在类加载时生成对象
     * final修饰该成员变量不可被修改
     */
    private static final Singleton1 INSTANCE = new Singleton1();

    private Singleton1(){}

    public static Singleton1 getInstance() {
        return INSTANCE;
    }
}
