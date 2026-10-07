package com.amu1uu.leetcode.Lingshen.l1007;

/**
 * @author amu1uu
 * {@code @date } 2026年10月07日 11:06
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** 数对和
 * 设计一个算法，找出数组中两数之和为指定值的所有整数对。一个数只能属于一个数对。
 */
public class MianShi16_24 {
    public List<List<Integer>> pairSums(int[] nums, int target) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int left = nums[i];
            int right = target - left;
            if(map.getOrDefault(right,0) > 0){
                ans.add(List.of(left,right));
                map.put(right,map.get(right)-1);
            }else{
                map.put(left,map.getOrDefault(left,0) + 1);
            }
        }
        return ans;
    }
}
