package com.mufeng.test.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferInputTest {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("readme2.txt"))) {

            System.out.println((char) bis.read()); //H
            bis.mark(2); // 标记H后面的e，并且显示读取两个
            System.out.println("mark(2)");
//            System.out.println((char) bis.read()); //e
//            System.out.println((char) bis.read()); //l

            bis.reset();// 从e重新开始
            System.out.println("reset01");
            System.out.println((char) bis.read()); //e
            System.out.println((char) bis.read()); //l
            System.out.println((char) bis.read()); //l
            System.out.println((char) bis.read()); //o
            System.out.println((char) bis.read()); //-1
            bis.reset();
            System.out.println("reset02");
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());
            System.out.println((char) bis.read());



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
