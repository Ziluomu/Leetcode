package com.amu1uu.leetcode.Hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author amu1uu
 * {@code @date } 2026年08月11日 12:43
 */

/**
 * 给你一个整数数组 nums ，判断是否存在三元组 [nums[i], nums[j], nums[k]] 满足 i != j、i != k 且 j != k ，同时还满足 nums[i] + nums[j] + nums[k] == 0 。请你返回所有和为 0 且不重复的三元组。
 *
 * 注意：答案中不可以包含重复的三元组。
 */
public class no15 {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int n = nums.length;
        List<List<Integer>> list = new ArrayList<>();
        while(i < n && nums[i] <= 0){
            // 重复元素，先i++再continue，防止卡住
            if(i>0 && nums[i] == nums[i - 1]){
                i++;
                continue;
            }
            int left = i+1,right = n-1;
            while(left < right){
                int sum = nums[left]+nums[right];
                int target = -nums[i];
                if(sum < target){
                    left +=1;
                } else if(sum > target){
                    right -=1;
                } else {
                    list.add(List.of(nums[i],nums[left],nums[right]));
                    // 跳过left重复值
                    while(left < right && nums[left]==nums[left+1]) left++;
                    // 跳过right重复值
                    while(left < right && nums[right]==nums[right-1]) right--;
                    // 指针移动，避免死循环
                    left++;
                    right--;
                }
            }
            i++;
        }
        return list;
    }
}
