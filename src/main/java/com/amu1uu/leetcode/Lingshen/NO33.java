package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月16日 11:51
 */

/**
 * 整数数组 nums 按升序排列，数组中的值 互不相同 。
 *
 * 在传递给函数之前，nums 在预先未知的某个下标 k（0 <= k < nums.length）上进行了 向左旋转，使数组变为 [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]（下标 从 0 开始 计数）。例如， [0,1,2,4,5,6,7] 下标 3 上向左旋转后可能变为 [4,5,6,7,0,1,2] 。
 *
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 *
 *  3 4 5 6 7 0 1 2 3 4 5 6       1
 * 你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
 */
public class NO33 {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0,right = n-1;
        int last = nums[right];
        while(left < right){
            int midInedx = (left + right)/2;
            int mid = nums[midInedx];
            if(mid == target) return midInedx;
            if(mid > last){ //mid左边升序
                if(target < mid && nums[left] <= target){
                    right = midInedx -1;
                } else {
                    left = midInedx +1;
                }
            } else { // 右边升序
                if(target > mid && nums[right] >= target){
                    left = midInedx +1;
                } else {
                    right = midInedx -1;
                }
            }
        }
        return nums[left] == target ? left : -1;
    }
    public  static void main(String[] args) {
        int [] nums = new int[]{4,5,6,7,0,1,2};
        int ans = search(nums,0);
        System.out.println(ans);
    }
}
