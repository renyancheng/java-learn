package com.mufeng.test.io;

import java.io.*;

public class BufferOutputTest {
    public static void main(String[] args) {
        try(BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("readme2.txt"))) {
            bos.write("Hello World".getBytes());
            bos.flush();
            System.out.println("写入成功");
            try(BufferedInputStream bis = new BufferedInputStream(new FileInputStream("readme2.txt")))  {
                byte[] bytes = new byte[bis.available()];
                bis.read(bytes);
                System.out.println(new String(bytes));
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}
