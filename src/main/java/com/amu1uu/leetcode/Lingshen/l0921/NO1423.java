package com.amu1uu.leetcode.Lingshen.l0921;

/**
 * @author amu1uu
 * {@code @date } 2026年09月21日 9:58
 */

/**
 * 几张卡牌 排成一行，每张卡牌都有一个对应的点数。点数由整数数组 cardPoints 给出。
 *
 * 每次行动，你可以从行的开头或者末尾拿一张卡牌，最终你必须正好拿 k 张卡牌。
 *
 * 你的点数就是你拿到手中的所有卡牌的点数之和。
 *
 * 给你一个整数数组 cardPoints 和整数 k，请你返回可以获得的最大点数。
 */
public class NO1423 {
    public int maxScore(int[] cardPoints, int k) {
        // 题设要的是从首尾取k次的总和最大，那么未被取的一定是位于中间的一段连续数组
        // 只要剩余的数组总和最小，则反过来得到从首尾取得元素之和最大
        // 因此窗口长度为n-k
        int n = cardPoints.length;
        int win = n-k; //
        long sum = 0, ans = Long.MAX_VALUE;
        long s = 0; // 记录全元素总和
        if(win == 0){
            // 全部卡片都拿，中间窗口长度为0
            for(int num : cardPoints) s += num;
            return (int)s;
        }
        for (int i = 0; i < n; i++) {
            sum += cardPoints[i];
            s += cardPoints[i];
            int left = i - win + 1;
            if (left < 0) {
                continue;
            }
            ans = Math.min(ans, sum);
            sum -= cardPoints[left];
        }
        return (int)(s-ans);
    }
}
