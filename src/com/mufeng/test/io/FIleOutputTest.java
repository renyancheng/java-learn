package com.mufeng.test.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputTest {
    public static void main(String[] args) throws IOException {
        try (FileOutputStream fos = new FileOutputStream("readme2.txt",  true)) {
//            fos.write(98);
            fos.write("HelloWorld".getBytes());
            fos.flush();
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
