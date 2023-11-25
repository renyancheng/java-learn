package com.mufeng.test;

import java.util.Scanner;

public class Main {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
           if (n == 0 && m == 0) break;
            double a = (4 * n - m) / 2;
            double b = n - a;
            if (Math.round(a) == a && Math.round(b) == b && a * 2 + b * 4 == m && m % 2 == 0 && a > 0 && b > 0) {
                System.out.println((int) a + " " + (int) b);
            } else {
                System.out.println("Error");
            }
        }
    }

}