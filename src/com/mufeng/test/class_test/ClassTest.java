package com.mufeng.test.class_test;

import java.util.Arrays;

public class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> studentClass = Student.class;
//        Class<?> studentClass1 = new Student().getClass();
        Class<?> studentClass2 = Class.forName("com.mufeng.test.class_test.Student");
//        System.out.println(studentClass == studentClass1);
//        System.out.println(studentClass2 == studentClass1);
        System.out.println(Arrays.toString(studentClass.getDeclaredFields()));
    }


}

