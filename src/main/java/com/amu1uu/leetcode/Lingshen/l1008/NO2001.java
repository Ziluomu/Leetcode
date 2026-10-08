package com.amu1uu.leetcode.Lingshen.l1008;

/**
 * @author amu1uu
 * {@code @date } 2026年10月08日 21:14
 */

import java.util.HashMap;

/** 可互换矩形的组数
 * 用一个下标从 0 开始的二维整数数组 rectangles 来表示 n 个矩形，其中 rectangles[i] = [widthi, heighti] 表示第 i 个矩形的宽度和高度。
 *
 * 如果两个矩形 i 和 j（i < j）的宽高比相同，则认为这两个矩形 可互换 。更规范的说法是，两个矩形满足 widthi/heighti == widthj/heightj（使用实数除法而非整数除法），则认为这两个矩形 可互换 。
 *
 * 计算并返回 rectangles 中有多少对 可互换 矩形。
 */
public class NO2001 {
    public long interchangeableRectangles(int[][] rectangles) {
        int n = rectangles.length;
        long ans = 0;
        HashMap<Double,Integer>map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            double ratio = (double) rectangles[i][0]/rectangles[i][1];
            if(map.containsKey(ratio)){
                ans += map.get(ratio);
            }
            map.put(ratio,map.getOrDefault(ratio,0)+1);
        }
        return ans;
    }
}
