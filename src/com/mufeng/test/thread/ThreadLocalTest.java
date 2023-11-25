package com.mufeng.test.thread;

public class ThreadLocalTest {
    public static void main(String[] args) {
        // 变量与线程绑定，在哪设置就在哪读取
        /*ThreadLocal<String> local = new ThreadLocal<>();
        local.set("Hello world");
        System.out.println(local.get());
        new Thread(() -> {
            System.out.println(local.get());
            local.set("dlrow、olleH");
            System.out.println(local.get());
        }).start();*/

        ThreadLocal<String> local = new InheritableThreadLocal<>();
        local.set("Hello World");
        new Thread(() -> {
            // 本质是将mian线程里的变量的值初始化了当前线程的变量的值，并非一个变量
            System.out.println(local.get());
            local.set("hello world");
            new Thread(() -> {
                System.out.println(local.get());
            }).start();
        }).start();
        try {
            Thread.sleep(100);
            System.out.println(local.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
