package com.mufeng.test.algo;

public class PreSum {
    public int[] preSum;

    public PreSum(int[] nums) {
        preSum = new int[nums.length+1];
        preSum[0] = 0;
        for (int i = 1; i < nums.length; i++) {
            preSum[i] = preSum[i-1] + nums[i-1];
        }
    }

    public int getSum(int i, int j){
        if(j + 1 > preSum.length){
            return preSum[preSum.length-1] - preSum[i];
        }else {
            return preSum[j+1] - preSum[i];
        }
    }
}
