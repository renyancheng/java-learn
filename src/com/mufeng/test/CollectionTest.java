package com.mufeng.test;

import java.util.*;

public class CollectionTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(Collections.max(list));
        Collections.fill(list, 0);
        System.out.println(list);
    }
}
