package com.amu1uu.leetcode.array;

/**
 * @author amu1uu
 * {@code @date } 2026年07月20日 15:56
 */

import java.util.Scanner;

/**
 * 给定一个整数数组 Array，请计算该数组在每个指定区间内元素的总和。
 * 第一行输入为整数数组 Array 的长度 n，接下来 n 行，每行一个整数，表示数组的元素。随后的输入为需要计算总和的区间下标：a，b （b > = a），直至文件结束。
 */
public class no58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 数组长度
        int[] nums = new int[n];
        int[] preSum = new int[n + 1]; // 前缀和
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            preSum[i + 1] = preSum[i] + nums[i]; // 前缀和
        }
        while (sc.hasNext()) {
            int left, right;
            left = sc.nextInt();
            right = sc.nextInt();
            int sum = preSum[right + 1] - preSum[left];
            System.out.println(sum);
        }
        sc.close();
    }
}
