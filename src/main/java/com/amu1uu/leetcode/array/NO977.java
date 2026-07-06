package com.amu1uu.leetcode.array;

/**
 * @author amu1uu
 * {@code @date } 2026年07月05日 13:21
 */

/**
 * 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */

/**
 * nums = [-4,-1,2,3,10]
 * [1,4,9,16,100]
 */
public class NO977 {
    public int[] sortedSquares(int[] nums) {
        int [] numsSquare= new int[nums.length];
        int left = 0, right = nums.length-1;
        int index = right;
        while(left <= right){
            int lSquare = nums[left] * nums[left];
            int rSquare = nums[right] * nums[right];
            if(lSquare > rSquare){
                numsSquare[index] = lSquare;
                left++;
            } else {
                numsSquare[index] = rSquare;
                right--;
            }
            index--;
        }
        return numsSquare;
    }


}
