package com.mufeng.test;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        if (scanner.hasNextInt()) {
            int num1 = scanner.nextInt();
            System.out.println("请输入第二个数");
            if (scanner.hasNextInt()) {
                int num2 = scanner.nextInt();
                System.out.println("请输入你要进行的操作（加减乘除）");
                if (scanner.hasNext()) {
                    String str = scanner.next();
                    switch (str) {
                        case "加" -> System.out.println(add(num1, num2));
                        case "减" -> System.out.println(subtract(num1, num2));
                        case "乘" -> System.out.println(multiply(num1, num2));
                        case "除" -> System.out.println(divide(num1, num2));
                        default -> System.out.println("操作无效");
                    }
                }
            }
        }
        scanner.close();
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }

}
