package com.amu1uu.leetcode.Lingshen.l1004;

/**
 * @author amu1uu
 * {@code @date } 2026年10月04日 14:58
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给你一个整数数组 nums 。
 *
 * 如果一组数字 (i,j) 满足 nums[i] == nums[j] 且 i < j ，就可以认为这是一组 好数对 。
 *
 * 返回好数对的数目。
 */
public class NO1512 {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, List<Integer>> temp = new HashMap<>();
        int n = nums.length,ans = 0;
        for (int i = 0; i < n; i++) {
            int key = nums[i];
            temp.computeIfAbsent(key,k-> new ArrayList<>()).add(i);
            List<Integer> list = temp.get(key);
        }
        for(List<Integer>l : temp.values()){
            int size = l.size();
            if(size > 1){
                ans += size * (size - 1) / 2;
            }
        }
        return ans;
    }
}
