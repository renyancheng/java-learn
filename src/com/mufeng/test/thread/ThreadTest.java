package com.mufeng.test.thread;

public class ThreadTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            Thread thread = new Thread(() -> {
                for (int j = 0; j < 10; j++) {
                    System.out.printf("我是%d号线程: 打印了%d", finalI, j);
                    System.out.println();
                    System.out.println(Thread.currentThread().getName());
                }
            });
            thread.start();
//            thread.run();
            /*

                run和start的区别：
                run实在当前线程里直接运行，所以是按顺序的
                start是创建新的线程去运行，导致输出的顺序不一样


             */
        }
    }
}
