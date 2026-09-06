package com.amu1uu.leetcode.Hot100.h0906;

/**
 * @author amu1uu
 * {@code @date } 2026年09月06日 15:20
 */

/**缺失的第一个正数
 * 给你一个未排序的整数数组 nums ，请你找出其中没有出现的最小的正整数。
 *
 * 请你实现时间复杂度为 O(n) 并且只使用常数级别额外空间的解决方案。
 */
public class NO41 {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            while(nums[i] >= 1 && i <= n && nums[nums[i] -1] != nums[i]){
                int j = nums[i] -1;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }
}
