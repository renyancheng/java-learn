package com.mufeng.test.thread;

// 弃用了，用不了。。。
public class SuspendTest {
    public static void main(String[] args) {
         Thread thread = new Thread(() -> {
             System.out.println("线程运行中");
//             Thread.currentThread().suspend();
             System.out.println("线程继续运行");
         });

         thread.start();
        try {
            Thread.sleep(3000);
//            thread.resume();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
