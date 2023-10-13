package com.mufeng.test.annotation;

public class AnnotationTest {
    public static void main(String[] args) {
        System.out.println("ok");
    }

    @Test({"A", "B", "C"})
    public void test() {

    }
}
