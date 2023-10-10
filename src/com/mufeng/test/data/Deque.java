package com.mufeng.test.data;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Deque {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(10);
        queue.offer(1);
        queue.offer(5);
        queue.offer(2);
        System.out.println(queue); //[1, 2, 5, 10]
        // 为什么是这个顺序呢，PriorityQueue底层是按照二叉最小堆实现的，具体如下
    /*

                    10
                  /
                 1


                    1
                  /    \
                10      5
               /
              2


                    1
                  /   \
                 2      5
                /
               10

                层序遍历后故为 1 2 5 10




     */
    }
}
