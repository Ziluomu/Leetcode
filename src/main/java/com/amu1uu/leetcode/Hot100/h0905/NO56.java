package com.amu1uu.leetcode.Hot100.h0905;

/**
 * @author amu1uu
 * {@code @date } 2026年09月05日 14:39
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 以数组 intervals 表示若干个区间的集合，其中单个区间为 intervals[i] = [starti, endi] 。请你合并所有重叠的区间，并返回 一个不重叠的区间数组，该数组需恰好覆盖输入中的所有区间 。
 */
public class NO56 {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(p,q)->p[0] - q[0]);
        List<int[]> ans = new ArrayList<>();
        for(int[] p : intervals){
            int m = ans.size();
            if(m > 0 && p[0] <= ans.get(m - 1)[1]){
                ans.get(m - 1)[1] = Math.max(ans.get(m - 1)[1], p[1]);
            }else {
                ans.add(p);
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}
