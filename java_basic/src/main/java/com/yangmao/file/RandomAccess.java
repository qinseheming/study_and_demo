package com.yangmao.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件分块访问
 */
public class RandomAccess {
    public static void main(String[] args) {
        File file = new File("D:/IDEAworkspace/Study/src/com/study/file/Copy.java");
        long length = file.length();
        int blockSize = 1024;
        int size = (int) (Math.ceil(length * 1.0 / blockSize));

        int beginPos = 0;
        int actualSize = (blockSize > length) ? (int) length : blockSize;
        for (int i = 0; i < size; i++) {
            beginPos = i * actualSize;
            if (i == size - 1) {
                actualSize = (blockSize > length) ? (int) length : blockSize;
            } else {
                length -= actualSize;
            }
            System.out.println("第" +i + "块，开始位置：" + beginPos + "，实际大小：" + actualSize);
            test1(beginPos, actualSize);
        }
    }

    public static void test1(int beginPos, int actualSize) {
        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("D:/IDEAworkspace/Study/src/com/study/file/Copy.java", "r");
            randomAccessFile.seek(beginPos);
            byte[] flush = new byte[1024];
            int len = -1;
            while ((len = randomAccessFile.read(flush)) != -1) {
                if (actualSize > len) {
                    System.out.println(new String(flush, 0, len));
                    actualSize = actualSize - len;
                } else {
                    System.out.println(new String(flush, 0, actualSize));
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
