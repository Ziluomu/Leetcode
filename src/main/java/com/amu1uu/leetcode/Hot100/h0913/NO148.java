package com.amu1uu.leetcode.Hot100.h0913;

/**
 * @author amu1uu
 * {@code @date } 2026年09月13日 14:03
 */

import com.amu1uu.leetcode.LinkList.ListNode;

import java.util.LinkedList;
import java.util.List;

/** 排序链表
 * 给你链表的头结点 head ，请将其按 升序 排列并返回 排序后的链表 。
 */
public class NO148 {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode fast = head.next,slow = head;
        while(fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode p1 = head,p2 = slow.next;
        slow.next = null;
        p1 = sortList(p1);
        p2 = sortList(p2);
        return mergeList(p1,p2);
    }

    private ListNode mergeList(ListNode p1, ListNode p2) {
        ListNode dum = new ListNode(0),cur = dum;
        while(p1!= null && p2 !=null){
            if (p1.val < p2.val){
                cur.next = p1;
                p1 = p1.next;
            } else {
                cur.next = p2;
                p2 = p2.next;
            }
            cur = cur.next;
        }
        if(p1 != null){
            cur.next = p1;
        }else  {
            cur.next = p2;
        }
        return dum.next;
    }
}
