package com.yangmao.file;

import java.io.File;
import java.io.IOException;

/**
 * File类常用方法
 */
public class FileDemo02 {
    public static void main(String[] args) throws IOException {
        File file = new File("IO.jpg");
        File absolveFile = new File("D:/IDEAworkspace/Study/IO.jpg");
        File path = new File("D:/IDEAworkspace/Study");
        File notExistsFile = new File("IO2.jpg");

        // getName() getAbsolveName() getParent()
        System.out.println("文件名：" + file.getName());
        System.out.println("文件夹名：" + path.getName());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件的目录名：" + file.getParent() + "（创建时使用相对路径创建）");
        System.out.println("文件的目录名：" + absolveFile.getParent() + "（创建时使用绝对路径创建）");

        // exists() length() 文件长度
        System.out.println(file.exists());
        System.out.println("文件长度：" + file.length());
        System.out.println("文件夹长度：" + path.length());
        System.out.println("不存在的文件的长度：" + notExistsFile.length());

        // createNewFile() delete()
        boolean flag = file.createNewFile();
        System.out.println(flag);

        flag = notExistsFile.createNewFile();
        System.out.println(flag);

        flag = notExistsFile.delete();
        System.out.println(flag);
    }
}
