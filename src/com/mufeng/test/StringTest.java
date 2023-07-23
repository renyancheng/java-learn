package com.mufeng.test;

public class StringTest {
    public static void main(String[] args) {

        String str = "Runoob";
        // 'new String()' 冗余
//    String str2 = new String("Runoob");
        String str2 = str;
        str = "Boonur";
        System.out.println(str + "\t" + str2);// -> Boonur	Runoob
        // 字符串长度
        System.out.println(str.length()); // -> 6
        // 连接字符串
        System.out.println(str.concat(str2)); //BoonurRunoob
        System.out.println("你好".concat("666"));// 你好666
        System.out.println("你好" + "666");// 同上
        // 创建格式化字符串
        System.out.printf("浮点型变量：%f, 整型：%d, 字符串: %s", 1.0, 1, "n");
        String fs;
        fs = String.format("浮点型变量的值为 " + "%f, 整型变量的值为 " + " %d, 字符串变量的值为 " + " %s", 1.0, 1, "n");// 同上

        // StringBuilder更快！！用来修改字符串
        //StringBuilder 类在 Java 5 中被提出，它和 StringBuffer 之间的最大不同在于
        // StringBuilder 的方法不是线程安全的（不能同步访问）
        // StringBuilder 速度更快！！
        StringBuilder sb = new StringBuilder(10);
        sb.append("Runoob..");
        System.out.println(sb);//1
        sb.append("!");
        System.out.println(sb);//2
        sb.insert(8, "Java");
        System.out.println(sb);//3
        sb.delete(5, 8);
        System.out.println(sb);//4
        /*
                1.Runoob..
                2.Runoob..!
                3.Runoob..Java!
                4.RunooJava!
         */
        //然而在应用程序要求线程安全的情况下，则必须使用 StringBuffer 类。
        StringBuffer sBuffer = new StringBuffer("菜鸟教程官网：");
        sBuffer.append("www");
        sBuffer.append(".runoob");
        sBuffer.append(".com");
        System.out.println(sBuffer);
        // 方法都差不多
    }
}
