package com.amu1uu.leetcode.array;

/**
 * @author amu1uu
 * {@code @date } 2026年07月20日 15:53
 */

/**
 * 给你一个正整数 n ，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的 n x n 正方形矩阵 matrix 。
 */
public class N059 {
    public int[][] generateMatrix(int n) {
        int [][] matrix = new int [n][n];
        int starx = 0, stary = 0,i = 1,loop = 1;
        while(loop <= n/2){
            for(; stary < n - loop ; stary++) {
                matrix[starx][stary] = i++;
            }
            // 此时stary = n-1
            for(; starx < n - loop ; starx++){
                matrix[starx][stary] = i++;
            }
            // 此时 stary = starx = n-1
            for(;stary >= loop  ; stary --){
                matrix[starx][stary] = i++;
            }
            for(;starx >= loop;starx --){
                matrix[starx][stary] = i++;
            }
            starx++;
            stary++;
            loop++;
            // 最外层结束
        }
        if(n % 2 == 1) {
            matrix[starx][stary] = i;
        }
        return matrix;
    }
}
