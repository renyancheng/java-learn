package com.mufeng.test.class_test;

public class Student1 {
    String name;
    int age;

    private Student1(String name) {
        this.name = name;
    }

    public String study(String str) {
        System.out.println("学习完了");
        return str;
    }
}