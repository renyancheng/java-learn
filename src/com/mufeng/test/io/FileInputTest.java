package com.mufeng.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputTest {

    public static void main(String[] args) {

        // try with resource
        try (InputStream is = new FileInputStream("readme.txt");) {
            byte[] bytes = new byte[is.available()];
//            while ((is.read(bytes)) != -1) {
            is.read(bytes);
            System.out.print(new String(bytes));
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
