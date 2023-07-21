package com.mufeng.test;

public class ForDemo1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <=100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("偶数和为"+sum);



        int sum2 = 0;
        for (int i = 0; i <=100; i++) {
            if (i % 2 == 1) {
                sum2 += i;
            }
        }
        System.out.println("奇数和为"+sum2);
    }
}
