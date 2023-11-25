package com.mufeng.test.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(new FileInputStream("test3.txt"))) {
            System.out.println(sc.next());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
