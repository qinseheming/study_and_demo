package com.yangmao.single;

import java.io.Serializable;

/**
 * 懒汉式单例
 * 1. 构造方法私有化
 * 2. 提供一个private static的变量，只声明不赋值
 * 3. 提供一个获取类的对象的方法，在第一次调用该方法时为变量赋值，需要加synchronized修饰防止并发环境下重复生成对象
 *
 * @author yangming
 * @date 2020/6/7
 */
public class Singleton2 implements Serializable {

    private static Singleton2 instance;

    private Singleton2() {
        // 防止反射破解单例
        if (instance != null) {
            throw new RuntimeException();
        }
    }

    public static synchronized Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }

    /**
     * 反序列化时会调用该方法，返回instance
     *
     * @return *
     */
    private Object readResolve() {
        return getInstance();
    }

}
