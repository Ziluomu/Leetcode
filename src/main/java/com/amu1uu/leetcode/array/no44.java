package com.amu1uu.leetcode.array;

/**
 * @author amu1uu
 * {@code @date } 2026年07月20日 20:51
 */

import java.util.Scanner;

/**
 * 在一个城市区域内，被划分成了n * m个连续的区块，每个区块都拥有不同的权值，代表着其土地价值。目前，有两家开发公司，A 公司和 B 公司，希望购买这个城市区域的土地。
 *
 * 现在，需要将这个城市区域的所有区块分配给 A 公司和 B 公司。
 *
 * 然而，由于城市规划的限制，只允许将区域按横向或纵向划分成两个子区域，而且每个子区域都必须包含一个或多个区块。 为了确保公平竞争，你需要找到一种分配方式，使得 A 公司和 B 公司各自的子区域内的土地总价值之差最小。
 *
 * 注意：区块不可再分。
 */
public class no44 {
    public static void main(String[] args) {
        // 采用前缀和。 分别求解行前缀和和列前缀和
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 行
        int m = sc.nextInt(); // 列
        int [][]nums = new int [n][m];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                nums[i][j] = sc.nextInt();
                sum += nums[i][j];
            }
        }
        // 行和
        int []hSum = new int [n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                hSum[i] += nums[i][j];
            }
        }
        int []hPreSum = new int[n+1];
        for (int i = 1; i < n+1; i++) {
            hPreSum[i] = hPreSum[i-1] + hSum[i -1];
        }
        // 列和
        int []lSum = new int[m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                lSum[i] += nums[j][i];
            }
        }
        int []lPreSum = new int [m+1];
        for (int i = 1; i < m+1; i++) {
            lPreSum[i] = lPreSum[i-1] + lSum[i -1];
        }
        // 统计行前缀和之间最小的差值
        int hresult = Integer.MAX_VALUE;
        int sub;
        for (int i = 1; i < n; i++) {
           sub = Math.abs(sum - 2 * hPreSum[i]);
           if(sub < hresult){
               hresult = sub;
           }
        }
        int lresult = Integer.MAX_VALUE;
        for (int i = 1; i < m; i++) {
            sub = Math.abs( sum - 2 * lPreSum[i]);
            if(sub < lresult){
                lresult = sub;
            }
        }
        int result = Math.min(lresult, hresult);
        System.out.println(result);
        sc.close();
    }
}
