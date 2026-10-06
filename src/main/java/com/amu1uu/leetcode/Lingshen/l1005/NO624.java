package com.amu1uu.leetcode.Lingshen.l1005;

import java.util.List;

/**
 * @author amu1uu
 * {@code @date } 2026年10月05日 20:06
 */

/** 数组列表中的最大距离
 * 给定 m 个数组，每个数组都已经按照升序排好序了。
 *
 * 现在你需要从两个不同的数组中选择两个整数（每个数组选一个）并且计算它们的距离。两个整数 a 和 b 之间的距离定义为它们差的绝对值 |a-b| 。
 *
 * 返回最大距离。
 */
public class NO624 {
    public int maxDistance(List<List<Integer>> arrays) {
        int ans = 0;
        int min = Integer.MAX_VALUE/2;
        int max = Integer.MIN_VALUE/2;
        for(List<Integer> list : arrays){
            int l =list.getFirst() ,r = list.getLast();
            ans = Math.max(ans,Math.max(max-l,r-min));
            min = Math.min(l,min);
            max = Math.max(r,max);
        }
        return ans;
    }
}

