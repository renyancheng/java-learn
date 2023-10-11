package com.mufeng.test.thread;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时任务已执行");
            }
        }, 0, 1000);
        try {
            Thread.sleep(5000);
            timer.cancel();
            System.out.println("over");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
