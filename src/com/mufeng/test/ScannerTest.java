package com.mufeng.test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入内容：");

        if (scanner.hasNextLine()) {
            String line = scanner.nextLine();
//            String str = scanner.next();
            System.out.println("你输入的内容是：");
//            System.out.println("next获取到的为：" + str);
            System.out.println("nextLine获取到的为：" + line);
        }

        scanner.close();
    }
}
