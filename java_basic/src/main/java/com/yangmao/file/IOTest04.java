package com.yangmao.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOTest04 {
    public static void main(String[] args) {
        File dest = new File("dest.txt");
        OutputStream os = null;
        try {
            os = new FileOutputStream(dest,false);
            String str = "Hello World";
            byte[] bytes = str.getBytes();
            os.write(bytes, 0, bytes.length);
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
