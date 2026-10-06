package com.amu1uu.leetcode.Lingshen.l1005;

/**
 * @author amu1uu
 * {@code @date } 2026年10月05日 16:08
 */

/** 增量元素之间的最大差值
 * 给你一个下标从 0 开始的整数数组 nums ，该数组的大小为 n ，请你计算 nums[j] - nums[i] 能求得的 最大差值 ，其中 0 <= i < j < n 且 nums[i] < nums[j] 。
 *
 * 返回 最大差值 。如果不存在满足要求的 i 和 j ，返回 -1 。
 */
public class NO2016 {
    public int maximumDifference(int[] nums) {
        int n = nums.length,ans = 0,min = nums[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min,nums[i]);
            ans = Math.max(ans,nums[i] - min);
        }
        return ans > 0 ? ans : -1;
    }
}
