package com.mufeng.test.projects.producerandconsumer;

import java.util.Date;
import java.util.Queue;

import java.util.LinkedList;
import java.util.Random;

public class Main {
    private static final Queue<Object> queue = new LinkedList<>();

    public static void main(String[] args) {
        new Thread(Main::add, "厨师1").start();
        new Thread(Main::add, "厨师2").start();
        new Thread(Main::take, "顾客1").start();
        new Thread(Main::take, "顾客2").start();
        new Thread(Main::take, "顾客3").start();
    }

    private static void add() {
        while (true) {
            try {
                Thread.sleep(3000);
                synchronized (queue) {
                    System.out.println(new Date() + " " + Thread.currentThread().getName() + "出餐了");
                    queue.offer(new Object());
                    queue.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void take() {
        while (true) {
            try {
                synchronized (queue) {
                    while (queue.isEmpty()) queue.wait();
                    Object obj = queue.poll();
                    if (obj != null) {
                        System.out.println(new Date() + " " + Thread.currentThread().getName() + "取餐了:" + obj.hashCode());
                    }
                }
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
