package com.amu1uu.leetcode.array;

/**
 * @author amu1uu
 * {@code @date } 2026年07月04日 10:32
 */

/**
 * 二分查找
 */

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，写一个函数搜索 nums 中的 target，如果 target 存在返回下标，否则返回 -1。
 *
 * 你必须编写一个具有 O(log n) 时间复杂度的算法。
 *
 *  2 3 4 5 6 7 8 4
 *  0 1 2 3 4 5 6
 */
public class No704 {

    public int search(int[] nums, int target) {

        int low = 0;
        int tail = nums.length -1 ;
        if (target < nums[0] || target > nums[nums.length - 1])
            return -1;
        int mid;
        while (low <= tail ) {
            mid =  low + (tail - low) / 2;
            if (target > nums[mid]) {
                low = mid + 1;
            } else if (target < nums[mid]) {
                tail = mid -1;
            } else if (target == nums[mid]) {
                return mid;
            }
        }
        return -1;
    }

}
