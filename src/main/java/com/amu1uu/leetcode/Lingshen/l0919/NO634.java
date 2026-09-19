package com.amu1uu.leetcode.Lingshen.l0919;

/**
 * @author amu1uu
 * {@code @date } 2026年09月19日 9:50
 */

/**
 * 给你一个由 n 个元素组成的整数数组 nums 和一个整数 k 。
 *
 * 请你找出平均数最大且 长度为 k 的连续子数组，并输出该最大平均数。
 *
 * 任何误差小于 10-5 的答案都将被视为正确答案。
 */
public class NO634 {
    public double findMaxAverage(int[] nums, int k) {
        // 定长找平均数最大，即找总和最大
        int n = nums.length;
        int sum = 0,ans = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int index = i - k +1;
            if(index < 0){
                continue;
            }
            ans = Math.max(ans,sum);
            sum -= nums[index];
        }
        return (double)ans/k;
    }
}
