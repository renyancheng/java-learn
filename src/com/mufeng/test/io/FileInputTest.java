package com.mufeng.test.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputTest {

    public static void main(String[] args) {

        try (InputStream is = new FileInputStream("readme.txt");) {
            int n;
            while ((n = is.read()) != -1) {
                System.out.println(n);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
