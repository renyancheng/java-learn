package com.mufeng.test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("aaa", "aaa", "nnns", "lbwmn", "Xswl", "Hello World"));

        // 注意： filter里面条件是要留下的，而不是去除的
        /*list = list.stream()
                .filter(str -> str.length() > 3) // 删除长度小于等于3的
                .filter(str -> str.charAt(0) >= 'A' && str.charAt(0) <= 'Z') // 去除小写字母开头的
                .distinct()// 去重
                .collect(Collectors.toList());*/
        List<Integer> intList = list.stream()
                .map(str -> str.length())
                .collect(Collectors.toList());
        System.out.println(list);
        System.out.println(intList);
        System.out.println(intList.stream().map(e -> e * e).collect(Collectors.toList()));
        // 逻辑清晰，链式调用，简洁好用就是stream，像sql一样

        Random random = new Random();
        IntSummaryStatistics iss = random.ints(0, 100)
                .limit(30).summaryStatistics();
        System.out.println(iss.getCount()); // 总数
        System.out.println(iss.getMax());// 最大数
        System.out.println(iss.getMin()); // 最小数
        System.out.println(iss.getAverage());// 平均数
    }
}
