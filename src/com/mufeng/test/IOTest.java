package com.mufeng.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest {
    public static void main(String[] args) throws IOException {
        /*char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下q退出");
        // 读取字符
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != 'q');*/
        // char要用单引号，String用双引号 String判断是否相等要用equals方法

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'end' to quit.");
        do {
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("end"));

    }
}
