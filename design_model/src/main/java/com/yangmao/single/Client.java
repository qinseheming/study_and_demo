package com.yangmao.single;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射和反序列化破解单例
 *
 * @author 75442
 */
public class Client {

    public static void main(String[] args) throws Exception {
        reflex();
        serializable();
    }

    /**
     * 反射方式破解单例
     * <p>
     * 解决办法：在单例类的构造方法中加入instance是否为null的判断(需要先调用创建实例的方法，后使用反射)
     *
     * @throws IllegalAccessException    *
     * @throws InvocationTargetException *
     * @throws InstantiationException    *
     * @throws NoSuchMethodException     *
     */
    public static void reflex() throws Exception {
        Singleton2 singleton = Singleton2.getInstance();
        Class<Singleton2> c1 = (Class<Singleton2>) Class.forName("com.study.designmodel.single.Singleton2");
        Constructor<Singleton2> constructor = c1.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton2 s1 = constructor.newInstance();
        Singleton2 s2 = constructor.newInstance();
        System.out.println(s1);
        System.out.println(s2);
    }

    /**
     * 反序列化方式破解单例模式
     * 解决方法：在单例类中添加readResolve方法，方法中返回单例对象
     */
    public static void serializable() {
        Singleton2 s1 = Singleton2.getInstance();
        System.out.println(s1);
        try (FileOutputStream fos = new FileOutputStream("d:/a.txt");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(s1);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream("d:/a.txt");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            Singleton2 s2 = (Singleton2) ois.readObject();
            System.out.println(s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}