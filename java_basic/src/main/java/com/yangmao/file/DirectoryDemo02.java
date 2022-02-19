package com.yangmao.file;

import java.io.File;

/**
 * 计算文件夹大小
 */
public class DirectoryDemo02 {
    public static void main(String[] args) {
        File path = new File("D:\\IDEAworkspace\\Study");
        long length = 0L;
        System.out.println(calculateDirLength(path, length));
    }

    public static long calculateDirLength(File path, long length) {
        File[] files = path.listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                length += calculateDirLength(file, length);
            } else {
                length += file.length();
            }
        }
        return length;
    }
}
