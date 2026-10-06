package com.amu1uu.leetcode.Lingshen.l1005;

/**
 * @author amu1uu
 * {@code @date } 2026年10月05日 20:26
 */

/** 两个值之间的最小绝对差值
 * 给你一个只包含 0、1 和 2 的整数数组 nums。
 *
 * 如果 nums[i] == 1 且 nums[j] == 2，则称下标对 (i, j) 为 有效 的。
 *
 * 请返回所有有效下标对中 i 和 j 之间的 最小 绝对差。如果不存在有效下标对，则返回 -1。
 *
 * 下标 i 和 j 之间的绝对差定义为 abs(i - j)。
 */
public class NO3880 {
    public int minAbsoluteDifference(int[] nums) {
        int n = nums.length,ans = Integer.MAX_VALUE/2,pre = -1,cnt = 0;
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            if(temp != 0){
                cnt ++;
                if(cnt >1 && temp != nums[pre]) {
                    ans = Math.min(ans,Math.abs(i - pre));
                }
                pre = i;
            }
        }
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
