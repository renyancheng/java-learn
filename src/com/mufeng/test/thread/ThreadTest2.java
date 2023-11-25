package com.mufeng.test.thread;


public class ThreadTest2 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                System.out.println(i);
                if (i == 5000) {
                    Thread thread2 = Thread.currentThread();

                }
            }
        });
    }
}
