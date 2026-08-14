package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月14日 18:05
 */

/**
 * 给你一个按 非递减顺序 排列的数组 nums ，返回正整数数目和负整数数目中的最大值。
 * 换句话讲，如果 nums 中正整数的数目是 pos ，而负整数的数目是 neg ，返回 pos 和 neg二者中的最大值。
 * Tip:0 既不是正整数也不是负整数。
 */
public class NO2529 {
    public int maximumCount(int[] nums) {
        int neg = lower_bound(nums, 0);
        int pos = nums.length - upper_bound(nums,0);
        return Math.max(neg,pos);
    }

    private int lower_bound(int[] nums, int target) {
        // 找第一个 ≥ target 的下标。
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private int upper_bound(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
