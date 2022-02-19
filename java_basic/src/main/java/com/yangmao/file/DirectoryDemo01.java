package com.yangmao.file;

import java.io.File;

/**
 * 文件夹常用方法
 */
public class DirectoryDemo01 {
    public static void main(String[] args) {
        File path = new File("D:/IDEAworkspace/Study");
        String[] subFileNames = path.list();
        System.out.println("文件夹下所有文件名");
        for (String subFileName : subFileNames) {
            System.out.println(subFileName);
        }
        File[] subFiles = path.listFiles();
        System.out.println("文件夹下所有文件对象(不是只有文件，包括文件夹)");
        for (File file : subFiles) {
            System.out.println(file);
        }
        File[] roots = File.listRoots();
        System.out.println("所有盘符");
        for (File file : roots) {
            System.out.println(file);
        }
    }
}
