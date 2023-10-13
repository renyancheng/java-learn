package com.mufeng.test.class_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Student> studentClass = Student.class;
        Constructor<Student> declaredConstructor = studentClass.getDeclaredConstructor(String.class);
        declaredConstructor.setAccessible(true);
        Student student = declaredConstructor.newInstance("小明");
        student.study("nihao");
        Method study = studentClass.getMethod("study", String.class);
        System.out.println(study.invoke(student, "小明"));



        // 反射太臃肿了，少用，后期非常难以维护
    }
}
