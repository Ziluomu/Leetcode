package com.amu1uu.leetcode.Hot100.h0810;

/**
 * @author amu1uu
 * {@code @date } 2026年08月10日 20:48
 */

import java.util.Arrays;
import java.util.HashSet;

/**
 * 给定一个未排序的整数数组 nums ，找出数字连续的最长序列（不要求序列元素在原数组中连续）的长度。
 *
 * 请你设计并实现时间复杂度为 O(n) 的算法解决此问题。
 */
public class NO128 {
        public int longestConsecutive_nlogn(int[] nums) {
            // 1.排序
            Arrays.sort(nums);
            // O(n)复杂度，只能遍历一次数组
            if(nums.length == 0){
                return 0;
            }
            int len = 1,max = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                if(nums[i+1] == nums[i]+1){
                    len++;
                } else if (nums[i+1] == nums[i]){
                    continue;
                }else {
                    if(len > max){
                        max = len;
                    }
                    len = 1;
                }
            }
            return Math.max(len,max);
        }

        // 上面方法的复杂度为O(nlogn),因为排序算法的最低复杂度为快速排序算法的O(nlogn)

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : set){
            set.add(num);
        }
        int max = 0;
        for (int num : nums) {
            if(!set.contains(num -1)){
                // 找到连续序列的起点
                int curnum = num;
                int curlen = 1;
                while(set.contains(curnum +1)){
                    curnum +=1;
                    curlen +=1;
                }
                max = Math.max(curlen,max);
            }
        }
        return max;
    }
}
