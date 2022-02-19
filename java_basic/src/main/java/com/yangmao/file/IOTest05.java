package com.yangmao.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 字符流
 */
public class IOTest05 {
    public static void main(String[] args) {
        File file = new File("abc.txt");
        Reader reader = null;
        try {
            reader = new FileReader(file);
            char[] flush = new char[1024];
            int len = -1;
            while ((len = reader.read(flush)) != -1) {
                String str = new String(flush, 0, len);
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
