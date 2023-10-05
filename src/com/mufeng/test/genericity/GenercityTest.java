package com.mufeng.test.genericity;

import java.util.ArrayList;
import java.util.Arrays;

public class GenercityTest {
    public static void main(String[] args) {
        Genericity01<String> var = new Genericity01<>("hello world");
//        System.out.println(var.getVar());
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4));
        System.out.println(arr);
    }
}
