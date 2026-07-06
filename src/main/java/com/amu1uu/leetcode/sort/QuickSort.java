package com.amu1uu.leetcode.sort;

/**
 * @author amu1uu
 * {@code @date } 2026年07月05日 14:29
 */

/**
 * 快速排序
 */

/**
 * 每轮把第一个元素作为基准值，右指针先往左找比基准小的数停下，左指针再往右找比基准大的数停下，两指针元素交换，重复至指针相遇，把基准放到相遇位置，再递归处理基准左右两段未排序区间。
 */
public class QuickSort {
    public static void quickSort(int[] arr, int left, int right){
        if(left >= right){
            return; // 退出递归
        }
        int l = left;
        int r = right;
        int pivot = arr[left];
        while(l < r){
            // 右指针找比基准小的
            while(l < r && arr[r] >= pivot) r--;
            // 左指针找比基准大的
            while(l < r && arr[l] <= pivot) l++;
            // 指针未相遇，交换两端元素
            if(l < r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
//        循环结束，l==r，基准归位
        arr[left] = arr[l];
        arr[l] = pivot;
//        递归左右区间
        quickSort(arr, left, l-1);
        quickSort(arr, l+1, right);
    }
}
