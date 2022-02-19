package com.yangmao.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件输入输出结合起来，完成复制的功能
 */
public class Copy {

    /**
     * 复制文件
     *
     * @param srcPath
     * @param destPath
     */
    public static void copy(String srcPath, String destPath) {
        File srcFile = new File(srcPath);
        File destFile = new File(destPath);
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new BufferedInputStream(new FileInputStream(srcFile));
            os = new BufferedOutputStream(new FileOutputStream(destFile, false));
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 复制文件夹
     *
     * @param srcPath
     * @param destPath
     */
    public static void copyDirectory(String srcPath, String destPath) {
        File srcDir = new File(srcPath);
        if (srcDir.isDirectory()) {
            File destDir = new File(destPath + File.separator + srcDir.getName());
            destDir.mkdir();
            File[] files = srcDir.listFiles();
            for (File file : files) {
                copyDirectory(file.getPath(), destDir.getPath());
            }
        } else if (srcDir.isFile()) {
            copy(srcDir.getPath(), destPath + File.separator + srcDir.getName());
        }
    }

    public static void main(String[] args) {
//        copy("src/com/study/file/Copy.java", "copy.txt");
//        copyDirectory("D:/IDEAworkspace/Study/src", "D:/test/");
        byte[] bytes = fileToByteArray("IO.jpg");
        System.out.println(bytes.length);
        byteArrayToFile(bytes, "IO-copy.jpg");
    }

    /**
     * 文件读取到字节数组中
     *
     * @param filePath
     * @return
     */
    public static byte[] fileToByteArray(String filePath) {
        File file = new File(filePath);
        InputStream is = null;
        ByteArrayOutputStream os = null;
        try {
            is = new FileInputStream(file);
            os = new ByteArrayOutputStream();
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
            return os.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    /**
     * 字节数组输出到文件
     *
     * @param bytes
     * @param filePath
     */
    public static void byteArrayToFile(byte[] bytes, String filePath) {
        File file = new File(filePath);
        OutputStream os = null;
        InputStream is = null;
        try {
            os = new FileOutputStream(file);
            is = new ByteArrayInputStream(bytes);
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                os.write(flush, 0, len);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}



















