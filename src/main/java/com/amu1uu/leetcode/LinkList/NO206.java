package com.amu1uu.leetcode.LinkList;

/**
 * @author amu1uu
 * {@code @date } 2026年08月02日 22:03
 */

import java.util.List;

/**
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 *
 */
public class NO206 {
    public ListNode reverseList(ListNode head) {
        //1 2 3 4 8 2 4
        //4 2 8 4 3 2 1
        ListNode pre = null;
        ListNode cur = head;
        ListNode temp = null;
        while (cur != null) {
            temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
