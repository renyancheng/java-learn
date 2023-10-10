package com.mufeng.test.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamTest {
    public static void main(String[] args) {
        try (PrintStream ps = new PrintStream(new FileOutputStream("test3.txt"))) {
            ps.println("你好");
            System.out.println("print successfully");
        } catch (IOException e ){
            e.printStackTrace();
        }
    }
}
