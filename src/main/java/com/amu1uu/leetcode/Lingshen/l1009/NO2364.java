package com.amu1uu.leetcode.Lingshen.l1009;

/**
 * @author amu1uu
 * {@code @date } 2026年10月09日 15:49
 */

import java.util.HashMap;

/** 统计坏数对的数目
 * 给你一个下标从 0 开始的整数数组 nums 。如果 i < j 且 j - i != nums[j] - nums[i] ，那么我们称 (i, j) 是一个 坏数对 。
 *
 * 请你返回 nums 中 坏数对 的总数目。
 */
public class NO2364 {
    public long countBadPairs(int[] nums) {
        // 移项：nums[j] - j !=nums[i] - i
        int n = nums.length;
        long ans = (long)(n-1) * n /2;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int val = nums[i] - i;
            ans -= map.getOrDefault(val,0);
            map.merge(val,1,Integer::sum);
        }
        return ans;
    }
}
