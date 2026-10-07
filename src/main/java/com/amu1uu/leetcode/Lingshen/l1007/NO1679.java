package com.amu1uu.leetcode.Lingshen.l1007;

/**
 * @author amu1uu
 * {@code @date } 2026年10月07日 10:41
 */

import java.util.*;

/** K 和数对的最大数目
 * 给你一个整数数组 nums 和一个整数 k 。
 *
 * 每一步操作中，你需要从数组中选出和为 k 的两个整数，并将它们移出数组。
 *
 * 返回你可以对数组执行的最大操作数。
 */
public class NO1679 {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length, ans = 0;
        for (int i = 0; i < n; i++) {
            int temp = nums[i],target = k -temp;
            if(map.getOrDefault(target,0) > 0){
                map.put(target,map.get(target) - 1);
                ans ++;
            }else {
                map.put(temp,map.getOrDefault(temp,0) + 1);
            }
        }
        return ans;
    }
}
