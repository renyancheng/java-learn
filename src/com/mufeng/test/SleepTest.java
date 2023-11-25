package com.mufeng.test;

import java.util.Date;

public class SleepTest {
    public static void main(String[] args) {
        try {
            System.out.println(new Date());
            // 阻塞线程三秒，然后输出三秒后的日期
            Thread.sleep(1000 * 3);
            System.out.println(new Date());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
