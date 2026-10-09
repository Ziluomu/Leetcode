package com.amu1uu.leetcode.Lingshen.l1009;

/**
 * @author amu1uu
 * {@code @date } 2026年10月09日 15:16
 */

import java.util.HashMap;

/**统计梯形的数目 I
 * 给你一个二维整数数组 points，其中 points[i] = [xi, yi] 表示第 i 个点在笛卡尔平面上的坐标。
 *
 * 水平梯形 是一种凸四边形，具有 至少一对 水平边（即平行于 x 轴的边）。两条直线平行当且仅当它们的斜率相同。
 *
 * 返回可以从 points 中任意选择四个不同点组成的 水平梯形 数量。
 *
 * 由于答案可能非常大，请返回结果对 109 + 7 取余数后的值。
 */
public class NO3623 {
    public int countTrapezoids(int[][] points) {
        final int MOD = (int)1e9 + 7;
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int[] p : points){
            map.merge(p[1],1,Integer::sum);
        }
        long ans = 0, s = 0;
        for(int i : map.values()){
            long k = (long)i*(i-1)/2;  //当前 y 层能生成多少条水平线段
            ans += s*k;
            s += k; //之前所有层的水平线段总和
        }
        return (int) (ans%MOD);
    }
}
