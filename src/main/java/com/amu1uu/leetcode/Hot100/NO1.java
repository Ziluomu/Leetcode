package com.amu1uu.leetcode.Hot100;

/**
 * @author amu1uu
 * {@code @date } 2026年08月10日 20:12
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
 *
 * 你可以按任意顺序返回答案。
 */
public class NO1 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if(map.containsKey(need)){
                return new int[]{
                        map.get(need), i
                };
            }
            map.put(nums[i] , i);

        }
        return new int[2];
    }
}
