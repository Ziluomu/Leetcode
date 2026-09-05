package com.amu1uu.leetcode.Hot100.h0905;

/**
 * @author amu1uu
 * {@code @date } 2026年08月14日 15:37
 */

/**
 * 给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 *
 * 子数组是数组中的一个连续部分。
 */

/**
 * dp动态规划
 */
public class NO53 {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int [] dp = new int [n];
        dp[0] = nums[0];
        int ans = dp[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i] , nums[i]);
            if(dp[i] > ans){
                ans = dp[i];
            }
        }
        return ans;
    }
}
