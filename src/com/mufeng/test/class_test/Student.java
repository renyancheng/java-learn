package com.mufeng.test.class_test;

public class Student {
    String name;
    int age;

    private Student(String name) {
        this.name = name;
    }

    public String study(String str) {
        System.out.println("学习完了");
        return str;
    }
}