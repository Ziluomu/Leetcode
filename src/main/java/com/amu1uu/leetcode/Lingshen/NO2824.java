package com.amu1uu.leetcode.Lingshen;

import java.util.Arrays;
import java.util.List;

/**
 * @author amu1uu
 * {@code @date } 2026年08月06日 15:53
 */

/**
 * 给你一个下标从 0 开始长度为 n 的整数数组 nums 和一个整数 target ，请你返回满足 0 <= i < j < n 且 nums[i] + nums[j] < target 的下标对 (i, j) 的数目。
 */
public class NO2824 {
    public int countPairs(List<Integer> nums, int target) {
        // 先对数组进行排序
        nums.sort(Integer::compareTo);
        int left = 0,n = nums.size();
        int right = n-1;
        int count  = 0;
        while(left < right){
            int sum = nums.get(left) + nums.get(right);
            if(sum<target){
                // 此时left与 left到right中间的所有元素相加均小于target
                count += right - left;
                left++;
            }else{
                right --;
            }
        }
        return count;
    }
}
