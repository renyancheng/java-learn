package com.mufeng.test.thread;

public class SyncTest {
    public static int k = 0;

    // synchronized关键词表示使方法同步化
    // 即，使多个线程中只有一个线程能调用此方法
    // 如果是成员方法，默认使用该对象为锁，如果是静态方法，就会用这个类成为锁
    public static synchronized void add() {
        k++;
    }

    public static void main(String[] args) {
        Object o = new Object();
        Thread thread = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                /*synchronized (SyncTest.class) {
                    k++;
                }*/
                add();
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                /*synchronized (SyncTest.class) {
                    k++;
                }*/
                add();
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 100000; i++) {
                // 因为静态方法默认使用类作为线程锁的，所以能继续同步k++, 达到300000
                synchronized (SyncTest.class) {
                    k++;
                }
            }
        });
        thread.start();
        thread2.start();
        thread3.start();
        try {
            Thread.sleep(1000);
            System.out.println(k);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
