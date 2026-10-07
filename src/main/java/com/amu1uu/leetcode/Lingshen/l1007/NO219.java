package com.amu1uu.leetcode.Lingshen.l1007;

/**
 * @author amu1uu
 * {@code @date } 2026年10月07日 11:15
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * 给你一个整数数组 nums 和一个整数 k ，判断数组中是否存在两个 不同的索引 i 和 j ，满足 nums[i] == nums[j] 且 abs(i - j) <= k 。如果存在，返回 true ；否则，返回 false 。
 */
public class NO219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if(map.containsKey(temp)){
                // 存在相同数字，计算下标差
                if(Math.abs(map.get(temp) - i) <= k){
                    return true;
                }
                // 距离超过k，更新为当前下标
                map.put(temp, i);
            }else{
                map.put(temp, i);
            }
        }
        return false;
    }

    public boolean containsNearbyDuplicate2(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            if(set.contains(temp)){
                return true;
            }else{
                set.add(temp);
            }
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
        }
        return false;
    }
}
