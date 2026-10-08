package com.amu1uu.leetcode.Lingshen.l1008;

/**
 * @author amu1uu
 * {@code @date } 2026年10月08日 21:08
 */

import java.util.HashMap;

/** 必须拿起的最小连续卡牌数
 * 给你一个整数数组 cards ，其中 cards[i] 表示第 i 张卡牌的 值 。如果两张卡牌的值相同，则认为这一对卡牌 匹配 。
 *
 * 返回你必须拿起的最小连续卡牌数，以使在拿起的卡牌中有一对匹配的卡牌。如果无法得到一对匹配的卡牌，返回 -1 。
 */
public class NO2260 {
    public int minimumCardPickup(int[] cards) {
        int n = cards.length,ans = Integer.MAX_VALUE;
        HashMap<Integer,Integer>map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int temp = cards[i];
            if(map.containsKey(temp)){
                ans = Math.min(ans,i - map.get(temp));
            }
            map.put(temp,i);
        }
        return ans == Integer.MAX_VALUE ? -1 : ans +1;
    }
}
