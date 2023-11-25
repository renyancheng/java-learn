package com.mufeng.test.class_test;

import java.lang.reflect.Field;

public class FieldTest {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Integer i = 10;
        Field value = Integer.class.getDeclaredField("value");
        value.setAccessible(true);
        System.out.println(value);
        value.set(i, 20);
        System.out.println(value);
        // jdk20已无法修改
    }
}
