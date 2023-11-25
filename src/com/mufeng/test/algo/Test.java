package com.mufeng.test.algo;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] nums = new int[]{2,3,1,5,1,3,6};
        PreSum preSum = new PreSum(nums);
        System.out.println(preSum.getSum(0, 1));
    }
}