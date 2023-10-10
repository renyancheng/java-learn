package com.mufeng.test.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputReaderTest {
    public static void main(String[] args) {
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream("readme3.txt"))) {
//            System.out.println((char) isr.read());
            char[] chars = new char[100];
            isr.read(chars);
            System.out.println(new String(chars));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
