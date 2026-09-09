package com.amu1uu.leetcode.Hot100.h0909;

import com.amu1uu.leetcode.LinkList.ListNode;

import java.util.List;

/**
 * @author amu1uu
 * {@code @date } 2026年09月09日 10:52
 */
public class NO234 {
    public boolean isPalindrome(ListNode head) {
        // 先算出链表长度，然后反转前半链表，依次判断前后链表的节点val是否相同
        //  1. 算链表长度
        int len = 0;
        ListNode cur = head;
        while(cur != null){
            len++;
            cur = cur.next;
        }
        // i 为链表长度
        //  2. 反转前半张链表
        ListNode pre = head;
        for (int i = 0; i < len/2; i++) {
            pre = pre.next;  // 反转后 前半段的起点
        }
        pre.next = null;
        ListNode suf = pre.next;
        if(len % 2 == 1){
            suf = suf.next;  // 如果长度为奇数，跳过中间节点
        }
        cur = head;
        ListNode newL =  reverse(cur,0,len/2);
        //  3. 依次判断节点
        for (int i = 0; i < len / 2; i++) {
            if(suf.val != newL.val) return false;
            suf = suf.next;
            newL = newL.next;
        }
        return true;
    }
    public ListNode reverse(ListNode node,int l, int r){
        int i = 0;
        ListNode cur = node,pre = null;
        while(i != l){
            cur = cur.next;
        }
        while(cur!=null && i< r){
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
            i++;
        }
        return pre;
    }
}
