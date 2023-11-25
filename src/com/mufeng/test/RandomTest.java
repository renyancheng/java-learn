package com.mufeng.test;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomTest {

    private final static int MAX = 1000;
    private final static int MIN = 1;

    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt()); // 随机的int
        Random random2 = new Random(2441260435L); // 设定种子的随机
        System.out.println(random2.nextInt());
        int num = random.nextInt(MAX - MIN + 1) + MIN; // 生成区间[1, 1000]的随机数
        System.out.println(num);
        int[] list = random.ints(-100, 100).filter(i -> i > 0 && i < 50).limit(20).sorted().toArray();
        List<Integer> list2 = random.ints(-100, 100).filter(i -> i > 0 && i < 50).limit(20).sorted().boxed().toList();
        System.out.println(Arrays.toString(list));
    }
}
