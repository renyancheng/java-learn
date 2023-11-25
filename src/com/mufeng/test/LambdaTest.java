package com.mufeng.test;

public class LambdaTest<T> {

    public LambdaTest() {
        System.out.println("构造函数已调用");
    }

    public static void main(String[] args) {
        InterfaceTest1 i1 = () -> "这个一个lambda表达式";
        System.out.println(i1.method());
        InterfaceTest2 i2 = LambdaTest::new;
        i2.method();
        User user = new User();
        InterfaceTest3<String> i3 = user::getUserName;

    }
}   


class User {
    public String getUserName() {
        String userName = "mufeng233";
        return userName;
    }
}

interface InterfaceTest1 {
    String method();
}

interface InterfaceTest2 {
    void method();
}

interface InterfaceTest3<T> {
    T method();
}