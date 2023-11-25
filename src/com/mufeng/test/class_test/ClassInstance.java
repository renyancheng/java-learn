package com.mufeng.test.class_test;

import java.lang.reflect.Constructor;

public class ClassInstance {
    public static void main(String[] args) throws ReflectiveOperationException {
        Class<Student1> studentClass = Student1.class;
        // 默认调用无参数构成方法， 而且必须是public
//        Student student = studentClass.newInstance();
//        System.out.println(student);
//        student.study();
        /*Student student = studentClass.getConstructor(String.class).newInstance("小明");
        System.out.println(student.name);*/
        Constructor<Student1> declaredConstructor = studentClass.getDeclaredConstructor(String.class);

        // 获得访问权限
        declaredConstructor.setAccessible(true);

        // 强制使用私有构造器，产生实例对象
        Student1 student = declaredConstructor.newInstance("小明");
        System.out.println(student.name);
    }
}
