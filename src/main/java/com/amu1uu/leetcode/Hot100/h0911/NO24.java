package com.amu1uu.leetcode.Hot100.h0911;

/**
 * @author amu1uu
 * {@code @date } 2026年09月11日 10:34
 */

import com.amu1uu.leetcode.LinkList.ListNode;

import java.util.List;

/** 两两交换链表中的节点
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
public class NO24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0,head);
        ListNode p0 = dummy,p1 = head;
        while (p1 != null && p1.next != null){
            ListNode p2 = p1.next, p3 = p2.next;
            p0.next = p2;
            p2.next = p1;
            p1.next = p3;

            p0 = p1;
            p1 = p3;
        }
        return dummy.next;
    }

    public ListNode swap(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

    }
}
