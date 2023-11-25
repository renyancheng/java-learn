package com.mufeng.test;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(f(5)); // 120
    }

    public static int f(int number) {
        if (number <= 1) return 1;
        else return number * f(number - 1);
    }
}
