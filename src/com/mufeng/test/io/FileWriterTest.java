package com.mufeng.test.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter("readme3.txt")) {
            fw.write("Hello World");
            System.out.println("already write readme3.txt");
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
