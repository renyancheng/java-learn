package com.mufeng.test;

import java.util.Optional;

public class OptionalTest {
    public static void main(String[] args) {
        test("134343525");
    }

    public static void test(String s) {
        Optional.ofNullable(s).ifPresent(str -> {
            if (!str.isEmpty())
                System.out.println(str.length());
        });
    }
}
