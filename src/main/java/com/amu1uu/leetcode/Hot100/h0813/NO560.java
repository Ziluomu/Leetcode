package com.amu1uu.leetcode.Hot100.h0813;

/**
 * @author amu1uu
 * {@code @date } 2026年08月13日 19:53
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 给你一个整数数组 nums 和一个整数 k ，请你统计并返回 该数组中和为 k 的子数组的个数 。
 *
 * 子数组是数组中元素的连续非空序列。
 * nums数组中的元素并非全正数
 */
public class NO560 {
    public int subarraySum(int[] nums, int k) {
        // 前缀和
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1); // 用来计算前缀和正好为k时，preSum-k的次数
        int preSum = 0;
        int ans = 0; // 数组中和为 k 的子数组的个数
        for(int num : nums){
            preSum += num;
            ans += map.getOrDefault(preSum - k , 0);
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return ans;
    }
}
