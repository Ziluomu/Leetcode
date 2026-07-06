package com.amu1uu.leetcode.sort;

/**
 * @author amu1uu
 * {@code @date } 2026年07月05日 14:12
 */

/**
 * 插入排序
 */
/**
 * 每次从未排序的元素中取一个，插入到已经排好序的序列中
 */
public class InsetSort {
    public static void insertSort(int[] arr) {
//        一个元素自然有序，因此从第二元素开始进行插入排序
        for (int i = 1; i < arr.length; i++) {
//        得从第二个元素开始插入，每一轮插入一个，共需要length-1轮
            int insertIndex = i; // 当前插值的初始下标
            int insertValue = arr[i]; // 本轮插值
            while (insertIndex > 0 && insertValue < arr[insertIndex - 1]) {
//               比本轮插值小的元素，需要依次往后挪
                arr[insertIndex] = arr[--insertIndex];
            }
//            循环结束，找到本轮插值应该插入的位置
            arr[insertIndex] = insertValue;
        }
    }
}
