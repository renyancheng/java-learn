package com.mufeng.test.junit4;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestMain {


    @Before
    public void before() {
        System.out.println("这是前置操作");
        Assert.assertTrue(1 == Math.max(0, 1));
    }

    @Test
    public void method() {
        int[] arr = {1, 2, 5, 3, 6, 7, 9, 0, 4, 8};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j + 1] < arr[j]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        Assert.assertArrayEquals("冒泡排序是否成功", new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, arr);
        System.out.println("测试样例通过");
    }

    @After
    public void after(){
        System.out.println("收尾动作");
    }


}
