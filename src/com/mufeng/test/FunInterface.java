package com.mufeng.test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunInterface {
    public static final Consumer<Teacher> TEACHER_CONSUMER = teacher -> System.out.println("老师好");
    public static final Function<Integer, String> INTEGER_STRING_FUNCTION = Object::toString;

    public static void main(String[] args) {
        Supplier<Teacher> teacherSupplier = Teacher::new;
        teacherSupplier.get().teach();
        Teacher teacher1 = teacherSupplier.get();
        TEACHER_CONSUMER
                .andThen(teacher -> System.out.println("大家好"))
                .accept(teacher1);
        Boolean result = INTEGER_STRING_FUNCTION
                .compose(String::length)
                .andThen(String::isEmpty)
                .apply("nihao");
        System.out.println(result);
        Predicate<Student> STUDENT_PREDICATE = student -> student.score >= 60;
        Student stu = new Student();
        stu.setScore(59);
        if (STUDENT_PREDICATE.test(stu)) {
            System.out.println("及格了");
        } else {
            System.out.println("没及格");
        }
    }

    public static class Teacher {
        public void teach() {
            System.out.println("我是老师，我要教你知识");
        }

    }

    public static class Student {
        private Integer score;

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }
    }
}
