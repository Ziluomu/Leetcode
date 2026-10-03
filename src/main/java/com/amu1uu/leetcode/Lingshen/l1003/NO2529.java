package com.amu1uu.leetcode.Lingshen.l1003;

/**
 * @author amu1uu
 * {@code @date } 2026年10月03日 15:46
 */

/**
 * 给你一个按 非递减顺序 排列的数组 nums ，返回正整数数目和负整数数目中的最大值。
 *
 * 换句话讲，如果 nums 中正整数的数目是 pos ，而负整数的数目是 neg ，返回 pos 和 neg二者中的最大值。
 * 注意：0 既不是正整数也不是负整数。
 */
public class NO2529 {
    public int maximumCount(int[] nums) {
        int neg = lower_bound(nums,0) + 1;
        int zero = upper_bound(nums, 0);
        int pos = nums.length - zero;
        return Math.max(neg,pos);
    }

    private int lower_bound(int[] nums, int target){
        int left = 0, right = nums.length -1;
        while(left <= right){
            int mid = left + (right -left)/2;
            int temp = nums[mid];
            if(temp >= target){
                right = mid - 1;
            } else {
                left = left + 1;
            }
        }
        return left;
    }

    private int upper_bound(int[] nums, int target){
        int left = 0, right = nums.length -1;
        while(left <= right){
            int mid = left + (right -left)/2;
            int temp = nums[mid];
            if(temp <= target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}
