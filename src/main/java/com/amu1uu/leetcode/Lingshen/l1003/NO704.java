package com.amu1uu.leetcode.Lingshen.l1003;

/**
 * @author amu1uu
 * {@code @date } 2026年10月03日 15:29
 */

/** 二分查找
 * 给定一个 n 个  **元素有序的（升序）**  整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果 target 存在返回下标，否则返回 -1。
 *
 * 你必须编写一个具有 O(log n) 时间复杂度的算法。
 */
public class NO704 {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length -1, ans = -1;
        while(left <= right){
            int mid = left + (right - left)/2;
            int temp = nums[mid];
            if(temp > target){
                right = mid - 1;
            } else if(temp < target){
                left = mid + 1;
            } else {
                ans = mid;
                return ans;
            }
        }
        return ans;
    }
}
