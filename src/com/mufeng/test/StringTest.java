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
        fs = String.format("浮点型变量的值为 " +
                "%f, 整型变量的值为 " +
                " %d, 字符串变量的值为 " +
                " %s", 1.0, 1, "n");// 同上
    }
}
