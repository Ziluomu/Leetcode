package com.amu1uu.leetcode.Lingshen.l1006;

/**
 * @author amu1uu
 * {@code @date } 2026年10月06日 11:43
 */

/** 等价多米诺骨牌对的数量
 * 给你一组多米诺骨牌 dominoes 。
 *
 * 形式上，dominoes[i] = [a, b] 与 dominoes[j] = [c, d] 等价 当且仅当 (a == c 且 b == d) 或者 (a == d 且 b == c) 。即一张骨牌可以通过旋转 0 度或 180 度得到另一张多米诺骨牌。
 *
 * 在 0 <= i < j < dominoes.length 的前提下，找出满足 dominoes[i] 和 dominoes[j] 等价的骨牌对 (i, j) 的数量。
 */
public class NO1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int n = dominoes.length,ans = 0;
        int[][] cnt = new int[10][10];
        for(int [] row : dominoes){
            int left = Math.min(row[0],row[1]);
            int right = Math.max(row[0],row[1]);
            ans += cnt[left][right]++;
        }
        return ans;
    }

}
