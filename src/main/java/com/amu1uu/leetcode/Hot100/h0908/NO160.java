package com.amu1uu.leetcode.Hot100.h0908;

import com.amu1uu.leetcode.LinkList.ListNode;

/**
 * @author amu1uu
 * {@code @date } 2026年09月08日 9:53
 */

/**相交链表
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表不存在相交节点，返回 null 。
 */
public class NO160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // 相交，即两个链表的某个节点的next域指向同一个节点
        ListNode p = headA,q = headB;
        while(p != q){
            if(p == null) {
                p = headB;
            } else {
                p = p.next;
            }
            if(q == null) {
                q = headA;
            }else {
                q = q.next;

            }
        }
        return p;
    }
}
