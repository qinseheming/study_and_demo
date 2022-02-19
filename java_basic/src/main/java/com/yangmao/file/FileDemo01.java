package com.yangmao.file;

import java.io.File;

public class FileDemo01 {

    public static void main(String[] args) {
        // 第一种方式构造File类
        File file = new File("C:/Users/75442/Pictures/IO.jpg");
        System.out.println(file.length());
        // 第二种方式构造File类
        file = new File("C:/Users/75442/Pictures/", "IO.jpg");
        System.out.println(file.length());
        // 第三种方式构造File类
        file = new File(new File("C:/Users/75442/Pictures/"), "IO.jpg");
        System.out.println(file.length());

        // 相对路径
        File file2 = new File("IO.jpg");
        System.out.println(file.getAbsolutePath());
        System.out.println(file2.getAbsolutePath());
    }
}
