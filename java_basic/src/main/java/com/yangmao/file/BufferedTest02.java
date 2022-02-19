package com.yangmao.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 带缓冲的字符输入流和输出流
 */
public class BufferedTest02 {

    public static void main(String[] args) {
        input("abc.txt");
        String str = "hello world \r\n 你好，世界";
        output(str, "BufferedTest.txt");
    }

    public static void input(String filePath) {
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String str = null;
            while ((str = reader.readLine()) != null) {
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void output(String str, String targetPath) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath))) {
            writer.write(str);
            writer.newLine();
            writer.append("123");
            writer.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
