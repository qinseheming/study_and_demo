package com.yangmao.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 带缓冲的字节输入流和输出流
 */
public class BufferedTest01 {

    public static void main(String[] args) {
        input("abc.txt");
        String str = "hello world \r\n 你好，世界";
        byte[] bytes = str.getBytes();
        output(bytes, "BufferedTest.txt");
    }

    public static void input(String filePath) {
        try(InputStream is = new BufferedInputStream(new FileInputStream(filePath))) {
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = is.read(flush)) != -1) {
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void output(byte[] bytes, String targetPath) {
        try(OutputStream os = new BufferedOutputStream(new FileOutputStream(targetPath))) {
            byte[] flush = new byte[1024];
            int len = -1;
            os.write(bytes);
            os.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
