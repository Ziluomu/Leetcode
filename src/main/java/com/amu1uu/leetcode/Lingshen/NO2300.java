package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月14日 18:24
 */

import java.util.Arrays;

/**
 * 给你两个正整数数组 spells 和 potions ，长度分别为 n 和 m ，其中 spells[i] 表示第 i 个咒语的能量强度，potions[j] 表示第 j 瓶药水的能量强度。
 *
 * 同时给你一个整数 success 。一个咒语和药水的能量强度 相乘 如果 大于等于 success ，那么它们视为一对 成功 的组合。
 *
 * 请你返回一个长度为 n 的整数数组 pairs，其中 pairs[i] 是能跟第 i 个咒语成功组合的 药水 数目。
 */
public class NO2300 {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int [] pairs = new int[n];
        Arrays.sort(potions);
        int m = potions.length;
        for (int i = 0; i < n; i++) {
            long spell = spells[i];
            long need = (success + spell - 1) / spell;
            // 向上取整公式：a/b------(a+b-1)/b
            int start = lower_bound(potions,need);
            pairs[i] = m - start ;
        }
        return pairs;
    }

    private int lower_bound(int [] nums , long target){
        int left = 0, right = nums.length -1;
        while(left <= right){
            int mid = (left + right)/2;
            if(nums[mid] >= target){
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
