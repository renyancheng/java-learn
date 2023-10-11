package com.mufeng.test.thread;

public class ThreadYieldTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                if (i % 5 == 0) {
                    System.out.println("让位了");
                    Thread.yield();
                }
                System.out.println("1打印了:" + i);
            }
            System.out.println("1打印完了");
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                System.out.println("2打印了:" + i);
            }
            System.out.println("2打印完了");
        });
        thread.start();
        thread2.start();
    }
}
