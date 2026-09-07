package com.amu1uu.leetcode.Hot100.h0907;

/**
 * @author amu1uu
 * {@code @date } 2026年09月07日 9:46
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/** 矩阵置零
 * 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
 */
public class NO73 {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length; // 行数
        int m = matrix[0].length; // 列数
        HashSet<Integer> row = new HashSet<>();
        HashSet<Integer> col = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(matrix[i][j] == 0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        // zero 中存放的是0元素的行和列
        for(int i : row){
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int j : col){
            for (int i = 0; i < m; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}
