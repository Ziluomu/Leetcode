package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月06日 16:08
 */

import java.util.Arrays;

/**
 * 给你一个长度为 n 的整数数组 nums 和 一个目标值 target。请你从 nums 中选出三个在 不同下标位置 的整数，使它们的和与 target 最接近。
 *
 * 返回这三个数的和。
 *
 * 假定每组输入只存在恰好一个解。
 */
public class NO16 {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums); //对数组进行排序
        int n = nums.length;
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < n; i++) {
            int left = i + 1, right = n - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(Math.abs(target - sum) < Math.abs(target - res)){
                    res = sum;
                }
                if(sum < target){
                    right++;
                }else if (sum > target){
                    left ++;
                } else {
                    return target;
                }
            }
        }
        return res;
    }
}
