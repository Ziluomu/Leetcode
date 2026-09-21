package com.amu1uu.leetcode.Lingshen.l0921;

/**
 * @author amu1uu
 * {@code @date } 2026年09月21日 9:28
 */

import java.util.HashMap;

/** 长度为 K 子数组中的最大和
 * 给你一个整数数组 nums 和一个整数 k 。请你从 nums 中满足下述条件的全部子数组中找出最大子数组和：
 *
 * 子数组的长度是 k，且
 * 子数组中的所有元素 各不相同 。
 * 返回满足题面要求的最大子数组和。如果不存在子数组满足这些条件，返回 0 。
 *
 * 子数组 是数组中一段连续非空的元素序列。
 */
public class NO2461 {
    public long maximumSubarraySum(int[] nums, int k) {
        int n = nums.length;
        long sum = 0,ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            } else{
                map.put(temp,1);
            }
            sum += temp;
            int left = i - k +1;
            if(left < 0){
                continue;
            }
            if(map.size() == k){
                ans = Math.max(ans,sum);
            }
            int leftVal = nums[left];
            sum -= leftVal;
            map.computeIfPresent(leftVal,(o,v) -> v == 1 ? null : v-1);
        }
        return ans;
    }

}
