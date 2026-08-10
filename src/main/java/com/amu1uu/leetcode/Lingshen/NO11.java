package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月07日 14:06
 */

/**
 * 给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
 *
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 返回容器可以储存的最大水量。
 */
public class NO11 {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0,right = height.length - 1;
        while(left < right){
            int area = (right - left) * Math.min(height[left] ,height[right]);
            ans = Math.max(ans,area);
            if(height[left] < height[right]){
                left ++;
            } else {
                right --;
            }
        }
        return ans;
    }
}
