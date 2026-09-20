package com.amu1uu.leetcode.Lingshen.l0920;

/**
 * @author amu1uu
 * {@code @date } 2026年09月20日 20:58
 */

/** 半径为 k 的子数组平均值
 * 给你一个下标从 0 开始的数组 nums ，数组中有 n 个整数，另给你一个整数 k 。
 *
 * 半径为 k 的子数组平均值 是指：nums 中一个以下标 i 为 中心 且 半径 为 k 的子数组中所有元素的平均值，即下标在 i - k 和 i + k 范围（含 i - k 和 i + k）内所有元素的平均值。如果在下标 i 前或后不足 k 个元素，那么 半径为 k 的子数组平均值 是 -1 。
 *
 * 构建并返回一个长度为 n 的数组 avgs ，其中 avgs[i] 是以下标 i 为中心的子数组的 半径为 k 的子数组平均值 。
 *
 * x 个元素的 平均值 是 x 个元素相加之和除以 x ，此时使用截断式 整数除法 ，即需要去掉结果的小数部分。
 *
 * 例如，四个元素 2、3、1 和 5 的平均值是 (2 + 3 + 1 + 5) / 4 = 11 / 4 = 2.75，截断后得到 2 。
 */
public class NO2090 {
    public int[] getAverages(int[] nums, int k) {
        int n = nums.length;
        int win = 2 * k + 1;
        int[] ans = new int[n];
        // 边界：窗口超过数组长度 或者k负数，全部填-1直接返回
        if(win > n || k < 0){
            for(int i = 0; i < n; i++){
                ans[i] = -1;
            }
            return ans;
        }
        long sum = 0; // 必须long，防止大数溢出！！！
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            ans[i] = -1;
        }
        for (int i = k; i < n; i++) {
            sum += nums[i];
            if(i >= 2*k) {
                ans[i - k] = (int)(sum / win);
            }
            int left = i - 2*k;
            if(left < 0){
                continue;
            }
            sum -= nums[left];
        }
        for (int i = n-k; i < n; i++) {
            ans[i] = -1;
        }
        return ans;
    }

}
