package com.mufeng.test.annotation;

public class OverrideTest {
    public static void main(String[] args) {
        Son son = new Son();
        son.say();
    }
}

class Father {
    public void say(){
        System.out.println("hello");
    }
}

class Son extends Father {
    // 写不写都会重写父类的方法
    // @Override只能修饰方法
    @Override
    public void say(){
        System.out.println("HELLO");
    }
}