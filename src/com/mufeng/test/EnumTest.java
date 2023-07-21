package com.mufeng.test;

public class EnumTest {
    enum Color {
        RED, Green, Grey, Blue, Orange, Yellow, Pink, Purple
    }

    public static void main(String[] args) {
        // enum.values(); -> enum本质是类，调用.values()方法后可转成数组
        System.out.println(Color.values()[0]); //RED
        // 枚举可以直接访问，本质是static final常量
        System.out.println(Color.RED);// RED
        // ordinal()方法可以查看当前枚举的索引
        System.out.println(Color.RED.ordinal()); //0
    }
}
