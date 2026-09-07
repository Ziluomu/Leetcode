package com.amu1uu.leetcode.Hot100.h0907;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author amu1uu
 * {@code @date } 2026年09月07日 10:09
 */

/** 螺旋矩阵
 * 给你一个 m 行 n 列的矩阵 matrix ，请按照 顺时针螺旋顺序 ，返回矩阵中的所有元素。
 */
public class NO54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length == 0){
            return new ArrayList<Integer>();
        }
        int l = 0,r = matrix[0].length - 1,t = 0, b = matrix.length -1 ,x = 0;
        Integer [] res = new Integer[(r + 1) * (b + 1)];
        while(true){
            for (int i = l; i <= r; i++) {
                res[x++] = matrix[t][i];
            }
            if(++t > b) break;
            for (int i = t; i <= b; i++) {
                res[x++] = matrix[i][r];
            }
            if(--r < l) break;
            for (int i = r; i >=l ; i--) {
                res[x++] = matrix[b][i];
            }
            if(--b < t) break;
            for (int i = b; i >=t ; i--) {
                res[x++] = matrix[i][l];
            }
            if(++l > r) break;
        }
        return Arrays.asList(res);
    }
}
