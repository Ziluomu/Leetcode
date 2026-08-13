package com.amu1uu.leetcode.Hot100.h0813;

/**
 * @author amu1uu
 * {@code @date } 2026年08月13日 20:16
 */

import java.util.ArrayDeque;

/**
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 *
 * 返回 滑动窗口中的最大值 。
 */
public class NO239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        int n = nums.length;
        int [] ans = new int[n - k + 1]; // 窗口的总个数
        for (int i = 0; i < n; i++) {
            // 队尾进
            while(!q.isEmpty() && nums[q.getLast()] < nums[i]){
                q.removeLast(); // 维护 q 的单调性 只有新元素比队尾元素大时，才入队替换队尾元素
            }
            q.addLast(i); // 存入的是元素的下标，并非元素本身

            // 队头出
            int left = i - k + 1; // 窗口左端点在数组中的下标
            if(q.getFirst() < left){  // 队首离开窗口
                q.removeFirst();
            }

            if(left >= 0){
                // 由于队首到队尾单调递减，所以窗口最大值就在队首
                ans[left] = nums[q.getFirst()];
            }
        }
        return ans;
    }
}
