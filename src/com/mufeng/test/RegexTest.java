package com.mufeng.test;

import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {
        String str = "mufeng";
        String pattern = ".*fe.*";
        boolean isMatch = Pattern.matches(pattern, str);
        System.out.println("字符串str有没有包含字符穿fe？？");
        System.out.println(isMatch ? "包含了" : "没包含"); // 包含了
    }
}
