package com.amu1uu.leetcode.Lingshen.l1004;

/**
 * @author amu1uu
 * {@code @date } 2026年10月04日 15:32
 */

import java.util.*;

/** 与对应负数同时存在的最大正整数
 * 给你一个 不包含 任何零的整数数组 nums ，找出自身与对应的负数都在数组中存在的最大正整数 k 。
 *
 * 返回正整数 k ，如果不存在这样的整数，返回 -1 。
 */
public class NO2441 {
    public int findMaxK(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = -1;
        for(int i : nums){
            if(i < 0){
                set.add(i);
            }
        }
        for(int i : nums){
            if(i > 0 && set.contains(-i)){
                ans = Math.max(ans,i);
            }
        }
        return ans;
    }
}
