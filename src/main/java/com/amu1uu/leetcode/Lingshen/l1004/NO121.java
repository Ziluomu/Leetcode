package com.amu1uu.leetcode.Lingshen.l1004;

/**
 * @author amu1uu
 * {@code @date } 2026年10月04日 15:40
 */

/** 买卖股票的最佳时机
 * 给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。
 *
 * 你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。
 *
 * 返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。
 */
public class NO121 {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0],ans = 0;
        for (int i = 1; i < prices.length; i++) {
            ans = Math.max(ans,prices[i] - minPrice);
            minPrice = Math.min(minPrice,prices[i]);
        }
        return ans;
    }
}
