package com.amu1uu.leetcode.Lingshen.l1008;

/**
 * @author amu1uu
 * {@code @date } 2026年10月08日 21:55
 */

import java.util.HashMap;
import java.util.HashSet;

/** 数组中的最大数对和
 * 给你一个下标从 0 开始的整数数组 nums 。请你从 nums 中找出和 最大 的一对数，且这两个数数位上最大的数字相等。
 *
 * 返回最大和，如果不存在满足题意的数字对，返回 -1 。
 */
public class NO2815 {
    public int maxSum(int[] nums) {
        int n = nums.length,ans = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int curVal = nums[i];
            int temp = maxBit(nums[i]);
            if(map.containsKey(temp)){
                ans = Math.max(ans,map.get(temp) + curVal);
                map.computeIfPresent(temp,(k,v) -> Math.max(v,curVal));
            }else {
                map.put(temp,curVal);
            }
        }
        return ans;
    }
    private int maxBit(int num){
        num = Math.abs(num);
        int ans = num%10;
        while(num > 0){
            num /= 10;
            ans = Math.max(ans,num%10);
        }
        return ans;
    }
}
