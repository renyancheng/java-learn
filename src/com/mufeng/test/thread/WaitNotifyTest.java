package com.mufeng.test.thread;

public class WaitNotifyTest {

    public static void main(String[] args) {
        Object o1 = new Object();
        Thread thread = new Thread(() -> {
            synchronized (o1) {
                try {
                    System.out.println("线程1开始了");
                    System.out.println("线程1开始等待");
                    o1.wait();
                    o1.wait(1000);
                    System.out.println("线程1结束了");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (o1) {
                try {
                    System.out.println("线程2开始了");
                    o1.wait(1000);
                    o1.notify();
                    int i = 0;
                    for (int j = 0; j < 50; j++) {
                        i++;
                    }
                    System.out.println("线程2求和完毕：" + i);
                    System.out.println("线程2结束了");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
        thread2.start();
    }
}
