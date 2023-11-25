package com.mufeng.test.thread;

public class ThreadJoinTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("1打印：" + i);
            }
            System.out.println("1完了");
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                if (i == 10) {
                    try {
                        System.out.println("线程1已加入到线程2");
                        thread.join(); // 使线程1加入到线程2，优先完成线程1，并非合到一个线程中每个线程还各是各的, 知识效果看起来像和在一起了
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println("2打印：" + i);
            }
            System.out.println("2完了");
        });
        thread.start();
        thread2.start();
    }
}
