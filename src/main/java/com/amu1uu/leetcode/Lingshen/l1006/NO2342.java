package com.amu1uu.leetcode.Lingshen.l1006;

/**
 * @author amu1uu
 * {@code @date } 2026年10月06日 10:51
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/** 数位和相等数对的最大和
 * 给你一个下标从 0 开始的数组 nums ，数组中的元素都是 正 整数。请你选出两个下标 i 和 j（i != j），且 nums[i] 的数位和 与  nums[j] 的数位和相等。
 *
 * 请你找出所有满足条件的下标 i 和 j ，找出并返回 nums[i] + nums[j] 可以得到的 最大值。如果不存在这样的下标对，返回 -1。
 */
public class NO2342 {
    public int maximumSum(int[] nums) {
        int n = nums.length, ans = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            int bitSum = digitSum(temp);
            if(map.containsKey(bitSum)){
                int oldVal = map.get(bitSum);
                ans = Math.max(ans,oldVal + temp);
                map.computeIfPresent(bitSum,(k,v)-> Math.max(oldVal,temp));
            } else {
                map.put(bitSum,temp);
            }
        }
        return ans;
    }
    private int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
