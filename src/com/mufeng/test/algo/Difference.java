package com.mufeng.test.algo;

public class Difference {
    private final int[] diff;

    public Difference(int[] nums) {
        assert nums.length > 0;
        diff = new int[nums.length + 1];
        diff[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            diff[i] = nums[i] - nums[i - 1];
        }
    }

    public void increase(int i, int j, int val) {
        diff[i] += val;
        if (j + 1 < diff.length) {
            diff[j + 1] -= val;
        }
    }

    public int[] get() {
        int[] res = new int[diff.length - 1];
        // 根据差分数组构造结果数组
        res[0] = diff[0];
        for (int i = 1; i < diff.length - 1; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }
}
