package com.amu1uu.leetcode.Lingshen.l0919;

/**
 * @author amu1uu
 * {@code @date } 2026年09月19日 9:30
 */

/**
 * 给你字符串 s 和整数 k 。
 *
 * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数。
 *
 * 英文中的 元音字母 为（a, e, i, o, u）。
 */
public class NO1456 {
    public int maxVowels(String s, int k) {
        if(k <= 0){
            return k;
        }
        int n = s.length(),vowel = 0,ans = 0;
        for (int i = 0; i < n; i++) {
            if(isVowel(s.charAt(i))){
                vowel++;
            }
            int index = i - k +1;
            if(index < 0){
                continue;
            }
            ans = Math.max(ans,vowel);
            if(isVowel(s.charAt(index))){
                vowel--;
            }
        }
        return ans;
    }
    private boolean isVowel(char s){
        if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
            return true;
        return false;
    }
}
