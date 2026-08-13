package com.amu1uu.leetcode.Hot100;

/**
 * @author amu1uu
 * {@code @date } 2026年08月13日 19:34
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个字符串 s 和 p，找到 s 中所有 p 的 异位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
 */
public class NO438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int[] countP = new int[128];
        int[] countS = new int[128];
        char[] arrS = s.toCharArray();
        char[] arrP = p.toCharArray();

        // 统计p的每个字母的数量
        for(char c : arrP){
            countP[c] ++;
        }

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            countS[arrS[right]]++; // 滑动窗口内的每个字母的数量

            // 滑动窗口大小。若窗口超过p的大小，窗口左边界收缩
            if(right - left +1 > p.length()){
                countS[arrS[left]]--;
                left++;
            }

            // 滑动窗口与p同大小时，对窗口内是否正好为一个异位词进行判定
            if(right - left +1 == p.length()){
                boolean ok = true;
                for (int i = 0; i < 128; i++) {
                    if(countS[i] != countP[i]){
                        ok = false;
                        break;
                    }
                }
                if(ok){
                    list.add(left);
                }
            }
        }
        return list;
    }
}
