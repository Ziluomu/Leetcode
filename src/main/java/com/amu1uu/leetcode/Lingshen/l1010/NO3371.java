package com.amu1uu.leetcode.Lingshen.l1010;

/**
 * @author amu1uu
 * {@code @date } 2026年10月10日 13:40
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/** 识别数组中的最大异常值
 * 给你一个整数数组 nums。该数组包含 n 个元素，其中 恰好 有 n - 2 个元素是 特殊数字 。剩下的 两个 元素中，一个是所有 特殊数字 的 和 ，另一个是 异常值 。
 *
 * 异常值 的定义是：既不是原始特殊数字之一，也不是表示元素和的那个数。
 *
 * 注意，特殊数字、和 以及 异常值 的下标必须 不同 ，但可以共享 相同 的值。
 *
 * 返回 nums 中可能的 最大异常值。
 */
public class NO3371 {
    public int getLargestOutlier(int[] nums) {
        // 1. 先算总和total
        // 2. 遍历 每次减去当前值/2，若得出的结果为数组中的值，则当前值为异常值
        int n = nums.length,ans = Integer.MIN_VALUE;
        long total = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums){
            total += num;
            map.merge(num,1,Integer::sum);
        }
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            long sum = total - temp;
            if(sum%2 != 0){
                continue;
            }
            map.put(temp,map.get(temp)-1);
            if(map.getOrDefault((int)(sum/2),0)>0){
                ans = Math.max(ans,temp);
            }
            map.merge(temp,1,Integer::sum);
        }
        return ans;
    }
}
