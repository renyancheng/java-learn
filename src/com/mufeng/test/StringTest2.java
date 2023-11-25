package com.mufeng.test;

public class StringTest2 {
    public static void main(String[] args) {
        String s1 = "ABCDEF";
        String s2 = "ABC" + "DEF";
        System.out.println(s1 == s2); // true
        String s3 = "DEF";
        String s4 = "ABC" + s3;
        System.out.println(s1 == s4); // false
        final String S5 = "DEF";
        String s6 = "ABC" + S5;
        System.out.println(s1 == s6); // true, 使用final关键字,在编译时将对S5进行宏替换

        /*

            总结： 再使用变量或者是方法时，运行时才能确定其值，编译时无法确定
                    但是使用final关键词变成常量，就可以再编译时确定其值，因此判断值是否相等时，返回了true

         */
    }
}
