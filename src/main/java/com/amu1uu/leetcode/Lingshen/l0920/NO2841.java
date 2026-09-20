package com.amu1uu.leetcode.Lingshen.l0920;

/**
 * @author amu1uu
 * {@code @date } 2026年09月20日 21:41
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/** 几乎唯一子数组的最大和
 * 给你一个整数数组 nums 和两个正整数 m 和 k 。
 *
 * 请你返回 nums 中长度为 k 的 几乎唯一 子数组的 最大和 ，如果不存在几乎唯一子数组，请你返回 0 。
 *
 * 如果 nums 的一个子数组有至少 m 个互不相同的元素，我们称它是 几乎唯一 子数组。
 *
 * 子数组指的是一个数组中一段连续 非空 的元素序列。
 */
public class NO2841 {
    public long maxSum(List<Integer> nums, int m, int k) {
        // 用一个hashset存储是否为独立元素
        if(m > k){
            return 0;
        }
        int n = nums.size();
        long sum = 0, ans = 0;
        HashMap<Integer,Integer> isIn = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = nums.get(i);
            sum += temp;
            isIn.put(temp, isIn.getOrDefault(temp, 0)+1);

            int left = i - k + 1;
            if(left < 0){
                continue;
            }
            if(isIn.size() >= m){
                ans = Math.max(ans,sum);
            }

            int leftVal = nums.get(left);
            isIn.computeIfPresent(leftVal,(o,v) -> v == 1 ? null :v-1);
            sum -= leftVal;
        }
        return ans;
    }
}
