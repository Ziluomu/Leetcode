package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月14日 17:44
 */

/**
 * 给你一个按照非递减顺序排列的整数数组 nums，和一个目标值 target。请你找出给定目标值在数组中的开始位置和结束位置。
 *
 * 如果数组中不存在目标值 target，返回 [-1, -1]。
 *
 * 你必须设计并实现时间复杂度为 O(log n) 的算法解决此问题。
 */
public class NO34 {
    public int[] searchRange(int[] nums, int target) {
        int start = lower_bound(nums,target);
        if(start == nums.length || nums[start] != target){
            return new int []{-1,-1};
        }
        int end = lower_bound(nums,target+1) -1;
        return new int [] {start,end};

    }
    private int lower_bound(int[] nums,int target){
        int left = 0,right = nums.length-1;
        while(left <= right){
            int mid =( left + right )/2;
            if(nums[mid] < target){
                left = mid +1 ;
            } else {
                right = mid -1;
            }
        }
        return left;
    }

}
