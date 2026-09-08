package com.amu1uu.leetcode.Hot100.h0908;

/**
 * @author amu1uu
 * {@code @date } 2026年09月08日 9:30
 */

/**
 * 编写一个高效的算法来搜索 m x n 矩阵 matrix 中的一个目标值 target 。该矩阵具有以下特性：
 *
 * 每行的元素从左到右升序排列。
 * 每列的元素从上到下升序排列。
 */
public class NO240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length ,n = matrix[0].length;
        int i = m - 1, j = 0;
        while( i >= 0 && j < n) {
            if (matrix[i][j] < target) {
                j++;
            } else if (matrix[i][j] == target) {
                return true;
            } else {
                i--;
            }
        }
        return false;
    }

}
