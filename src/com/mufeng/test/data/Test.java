package com.mufeng.test.data;

public class Test {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.push(1);
        q.push(2);
        System.out.println(q.pop());
        System.out.println(q.peek());
    }
}
