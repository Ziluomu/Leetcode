package com.amu1uu.leetcode.Lingshen.l1002;

/**
 * @author amu1uu
 * {@code @date } 2026年10月02日 16:19
 */

/** 搜索插入位置
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 请必须使用时间复杂度为 O(log n) 的算法。
 */
public class NO35 {
    public int searchInsert(int[] nums, int target) {
        return lower_bound(nums,target);
    }
    private int lower_bound(int[] nums, int target){
        int left = 0 ,right = nums.length -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            int temp = nums[mid];
            if(temp >= target){
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
