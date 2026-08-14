package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月14日 18:35
 */

import java.util.Arrays;

/**
 * 给你两个整数数组 arr1 ， arr2 和一个整数 d ，请你返回两个数组之间的 距离值 。
 *
 * 「距离值」 定义为符合此距离要求的元素数目：对于元素 arr1[i] ，不存在任何元素 arr2[j] 满足 |arr1[i]-arr2[j]| <= d 。
 */
public class NO1385 {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int ans = 0;
        for (int i = 0; i < arr1.length; i++) {
            int index = Arrays.binarySearch(arr2, arr1[i] - d);
            if(index < 0){ //没找到恰好距离值为d的对应值
                index = ~index;// index = -index -1
            }
            if(index == arr2.length || arr2[index] > arr1[i] + d){
                ans ++;
            }
        }
        return ans;
    }

}
