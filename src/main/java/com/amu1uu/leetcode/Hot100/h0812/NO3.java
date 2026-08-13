package com.amu1uu.leetcode.Hot100.h0812;

/**
 * @author amu1uu
 * {@code @date } 2026年08月13日 19:14
 */

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长 子串 的长度。
 */
public class NO3 {
    public int lengthOfLongestSubstring(String s) {
        int len = 0;
        char [] ss = s.toCharArray();
        int left = 0,right;
        int [] cnt = new int [128];
        for (right = 0; right < ss.length; right++) {
            char c = ss[right];
            cnt[c] ++;
            while(cnt[c] > 1){
                cnt[ss[left]] --;
                left ++;
            }
            len = Math.max((right - left + 1) , len);
        }
        return len;
    }

    public int lengthOfLongestSubstring2(String s) {
        int len = 0;
        char [] ss = s.toCharArray();
        int left = 0,right;
        boolean [] has = new boolean[128];
        for (right = 0; right < ss.length; right++) {
            char c = ss[right];
            while(has[c]){
                has[ss[left]] = false;
                left ++;
            }
            has[c] = true;
            len = Math.max((right - left + 1) , len);
        }
        return len;
    }
}
