package com.amu1uu.leetcode.Hot100.h0811;

/**
 * @author amu1uu
 * {@code @date } 2026年08月11日 12:30
 */

/**
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 请注意 ，必须在不复制数组的情况下原地对数组进行操作。
 */
public class NO283 {
    public void moveZeroes(int[] nums) {
        int num = 0; // 记录0的数量
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                num++;
            } else{
                nums[i - num] = nums[i];
            }
        }
        for (int i = nums.length - num; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
