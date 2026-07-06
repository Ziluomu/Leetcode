package com.amu1uu.leetcode.sort;

/**
 * @author amu1uu
 * {@code @date } 2026年07月05日 13:40
 */
/**
 * 冒泡排序
 */

/**
 * 每一轮可以确定一个元素的最终位置。
 * 第一轮后最大的数位于最后一个
 * 第二轮后最大的两个数位于最后两个
 * 以此类推
 */
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
//    一个长度为length的数组，总共需要length-1轮
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
//            设定一个参数判定本轮是否发生交换
            for (int j = 0; j < arr.length - 1 - i; j++) {
//                末尾的i个元素已经排好序
//                每轮都需要从第一个元素开始遍历
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false){
                return;
                }
//            本轮未发生交换，说明已经完成排序
        }
    }
}
