package com.mufeng.test.thread;

public class InterruptTest {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("第一个标记");
                    break;
                }
            }
            Thread.interrupted();
            while (true) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("第二个标记");
                    break;
                }
            }
        });
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        try {
            Thread.sleep(3000);
            thread.interrupt();
            Thread.sleep(3000);
            thread.interrupt();
//            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
