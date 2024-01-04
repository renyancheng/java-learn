package com.mufeng.test;

public class ExtendsTest {
    public static void main(String[] args) {
        Teacher teacher = new Teacher(1, "小明", 18, "男");
        System.out.println(teacher);
    }

    abstract static class Person {
        int id;
        String name;
        int age;
        String sex;

        void eat() {
        }

        public Person(int id, String name, int age, String sex) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        void sleep() {
        }
    }

    static class Teacher extends Person {
        int tid;

        public Teacher(int id, String name, int age, String sex) {
            super(id, name, age, sex);
        }

        void teach() {
        }
    }
}
