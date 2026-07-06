package com.amu1uu.leetcode.sort;

/**
 * @author amu1uu
 * {@code @date } 2026年07月05日 13:56
 */

/**
 * 选择排序
 */

/**
 * 每轮比较剩余未排序元素，找到最小的元素，放在此时未排序序列的列头
 * 即每轮确定一个元素
 */
public class SelectSort {
    public static void selectSort(int[] arr) {
        //    一个长度为length的数组，总共需要length-1轮
        for (int index = 0; index < arr.length - 1; index++) {
            int min = arr[index];
            int minIndex = index;
            for (int i = index + 1; i < arr.length; i++) {
//              min和minIndex是复制的位于index的元素，直接从下一个元素开始，避免自己与自己比较
                if (arr[i] < min) {
                    min = arr[i];
                    minIndex = i;
                }
            }
//            仅当本轮最小值不在当前未排序序列列头时才发生元素对换
            if (minIndex != index) {
                arr[minIndex] = arr[index];
                arr[index] = min;
            }
        }
    }
}
