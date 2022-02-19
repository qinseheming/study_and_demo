package com.yangmao.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * 转换流：InputStreamReader
 */
public class InputStreamReaderTest01 {
    public static void main(String[] args) {
        // 循环读取键盘输入的字节并输出
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));) {
            String str = null;
            while ((str = reader.readLine()) != null) {
                writer.write(str);
                writer.newLine();
                writer.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
