package com.amu1uu.leetcode.Hot100.h0813;

/**
 * @author amu1uu
 * {@code @date } 2026年08月13日 20:43
 */

import java.util.HashMap;

/**
 * 给定两个字符串 s 和 t，长度分别是 m 和 n，返回 s 中的 最短窗口 子串，使得该子串包含 t 中的每一个字符（包括重复字符）。如果没有这样的子串，返回空字符串 ""。
 */
public class NO76 {
    public String minWindow(String s, String t) {
        // 灵神方法
        int [] diff = new int[128]; // new数组时，会自动给每个数组单元赋值0
        int kinds = 0;
        for(char c : t.toCharArray()){
            if(diff[c] == 0){
                kinds++; // 统计t有多少个不同的字母
            }
            diff[c]--;
        }

        char[] arrS = s.toCharArray();
        int m = arrS.length;
        int ansLeft = -1;
        int ansRight = m;
        int geCnt = 0; // 窗口内有 geCnt 种字母的出现次数 >= t 中相应字母的出现次数
        int left = 0;

        for (int right = 0; right < m; right++) {
            char c = arrS[right];
            diff[c]++;
            if(diff[c] == 0){ // 原来窗口内 c 的出现次数比 t 的少，现在一样多
                geCnt++; // 从 < 变成 >=
            }

            while (geCnt == kinds) { // 涵盖：所有字母的出现次数都是 >=
                if (right - left < ansRight - ansLeft) { // 找到更短的子串
                    ansLeft = left; // 记录此时的左右端点
                    ansRight = right;
                }

                char x = arrS[left]; // 左端点字母
                if (diff[x] == 0) {
                    // x 移出窗口之前，检查出现次数，
                    // 如果窗口内 x 的出现次数和 t 一样，
                    // 那么 x 移出窗口后，窗口内 x 的出现次数比 t 的少
                    geCnt--; // 从 >= 变成 <
                }
                diff[x]--; // 左端点字母移出子串
                left++;
            }
        }

        return ansLeft < 0 ? "" : s.substring(ansLeft, ansRight + 1);
    }


    public String minWindow1(String s, String t) {
        // HashMap的方式  自己思路 + AI

        char[] arrT = t.toCharArray();
        char[] arrS = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : arrT) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0, match = 0, startIndex = 0;
        int minLen = Integer.MAX_VALUE;
        for (int right = 0; right < s.length(); right++) {
            char c = arrS[right];
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
                if (map.get(c) == 0) {
                    match++;
                }
            }
            while (match == map.size()) {
                int len = right - left + 1;
                if (len < minLen) {
                    minLen = len;
                    startIndex = left;
                }
                char leftC = arrS[left];
                if (map.containsKey(leftC)) {
                    if (map.get(leftC) == 0) {
                        match--;
                    }
                    map.put(leftC, map.get(leftC) + 1);
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
}

