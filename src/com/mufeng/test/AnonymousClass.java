package com.mufeng.test;

public class AnonymousClass {
    public static void main(String[] args) {
        ITest test = new ITest() {
            @Override
            public void test() {
                System.out.println("test");
            }
        };
        System.out.println("test的类名是" + test.getClass());
    }
}
