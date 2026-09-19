package com.amu1uu.leetcode.Lingshen.l0919;

/**
 * @author amu1uu
 * {@code @date } 2026年09月19日 10:00
 */

/**
 * 给你一个整数数组 arr 和两个整数 k 和 threshold 。
 *
 * 请你返回长度为 k 且平均值大于等于 threshold 的子数组数目。
 */
public class NO1343 {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int n = arr.length;
        int target = threshold * k;
        int ans = 0,sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            int left = i - k +1;
            if(left < 0 ){
                continue;
            }
            if(sum >= target){
                ans ++;
            }
            sum -= arr[left];
        }
        return ans;
    }
}
