package com.mufeng.test.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FIleOutputTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(".\\test.txt");
        fos.write(98);
        fos.close();
        System.out.println("写入成功");
    }
}
