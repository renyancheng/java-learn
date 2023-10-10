package com.mufeng.test.io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("readme.txt")){
            char[] chars = new char[100];
            fr.read(chars);
            for (char aChar : chars) {
                System.out.print(aChar);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
