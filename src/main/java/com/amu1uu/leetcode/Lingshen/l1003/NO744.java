package com.amu1uu.leetcode.Lingshen.l1003;

/**
 * @author amu1uu
 * {@code @date } 2026年10月03日 15:33
 */

/** 寻找比目标字母大的最小字母
 * 给你一个字符数组 letters，该数组按 非递减顺序 排序，以及一个字符 target。letters 里至少有两个不同的字符。
 *
 * 返回 letters 中大于 target 的最小的字符。如果不存在这样的字符，则返回 letters 的第一个字符。
 */
public class NO744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0, right = letters.length - 1;
        char ans = letters[0];
        while(left <= right){
            int mid = left + (right - left)/2;
            char temp = letters[mid];
            if(temp > target){
                right = mid -1;
            } else{
                left = mid + 1;
            }
        }
        if(left == letters.length){
            return letters[0];
        }
        ans = letters[right+1];
        return ans;
    }
}
