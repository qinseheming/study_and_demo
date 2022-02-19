package com.yangmao.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符输出流
 */
public class IOTest06 {
    public static void main(String[] args) {
        File file = new File("test6.txt");

        try(Writer writer = new FileWriter(file)) {
            String str = "Hello World";
            // 第一种方式：append
//            writer.append(str).append("你好，世界");
//            writer.flush();
            // 第二种方式：write(char[])
            char[] chars = str.toCharArray();
            writer.write(chars);
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
