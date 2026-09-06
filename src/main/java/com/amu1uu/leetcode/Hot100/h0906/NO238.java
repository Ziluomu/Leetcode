package com.amu1uu.leetcode.Hot100.h0906;

/**
 * @author amu1uu
 * {@code @date } 2026年09月06日 14:04
 */

/** 除了自身以外数组的乘积
 * 给你一个整数数组 nums，返回 数组 answer ，其中 answer[i] 等于 nums 中除了 nums[i] 之外其余各元素的乘积 。
 *
 * 题目数据 保证 数组 nums之中任意元素的全部前缀元素和后缀的乘积都在  32 位 整数范围内。
 *
 * 请 不要使用除法，且在 O(n) 时间复杂度内完成此题。
 */
public class NO238 {
    public int[] productExceptSelf(int[] nums) {
        // 前缀积+后缀积
        int n = nums.length;
        int [] pre = new int[n];
        pre[0] = 1;
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i-1] * nums[i-1];
        }
        int [] suf = new int[n];
        suf[n-1] = 1 ;
        for (int i = n-2; i > -1 ; i--) {
            suf[i] = suf[i+1] * nums[i+1];
        }
        int [] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = pre[i] * suf[i];
        }
        return ans;
    }

    //优化空间复杂度O1
    public int[] productExceptSelf1(int[] nums) {
        int n = nums.length;
        int [] suf = new int [n];
        suf[n-1] = 1;
        for (int i = n-2; i > -1 ; i--) {
            suf[i] = suf[i+1] * nums[i+1];
        }
        int pre = 1;
        for (int i = 0; i < n; i++) {
            suf[i] *= pre;
            pre *= nums[i];
        }
        return suf;
    }
}
