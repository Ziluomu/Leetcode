package com.amu1uu.leetcode.Hot100.h0906;

/**
 * @author amu1uu
 * {@code @date } 2026年09月06日 13:49
 */

/**轮转数组
 * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 */
public class NO189 {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // 避免k>数组长度
        reverse(nums,0,n-1); // 整体反转数组
        reverse(nums,0,k-1);
        reverse(nums,k  ,n-1);
    }
    public void reverse(int[] arr,int l, int r){
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }
}
