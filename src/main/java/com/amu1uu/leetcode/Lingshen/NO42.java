package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月07日 14:10
 */

/**
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 */
public class NO42 {
    public int trap(int[] height) {
        int ans = 0, n = height.length;
        int [] preMax = new int[n]; // preMax[i] 表示从 height[0] 到 height[i] 的最大值
        preMax[0] = height[0];
        int [] sufMax = new int[n];
        sufMax[n-1] = height[n -1];
        for (int i = 1; i < n; i++) {
            preMax[i] = Math.max(height[i] , preMax[i-1]);
        }
        for (int i = n -2; i >= 0; i--) {
            sufMax[i] = Math.max(sufMax[i+1] , height[i]);
        }
        for (int i = 0; i < n; i++) {
            ans += Math.min(preMax[i] , sufMax[i]) - height[i];
        }
        return ans;
    }
}
