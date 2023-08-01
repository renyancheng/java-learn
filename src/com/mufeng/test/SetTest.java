package com.mufeng.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        HashSet<Integer> hashset = new HashSet<>();
        hashset.add(1);
        hashset.add(2);
        hashset.add(3);
        hashset.add(4);
       /* Object[] arr = set.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }*/
        Iterator<Integer> it = hashset.iterator();
        // idea快捷键itit
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // 可自动排序
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(-1);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(-8);
        Iterator<Integer> it2 = treeSet.iterator();
        System.out.println("TreeSet的排序");
        while (it2.hasNext()) {
            Integer next = it2.next();
            System.out.println(next);
        }
    }
}
