package com.amu1uu.leetcode.Hot100.h0908;

/**
 * @author amu1uu
 * {@code @date } 2026年09月08日 10:05
 */

import com.amu1uu.leetcode.LinkList.ListNode;

import java.util.List;

/**反转链表
 * 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 */
public class NO206 {
    public ListNode reverseList(ListNode head) {
        // 2 4 5 7 9
        // 9 7 5 4 2
        ListNode cur = head,pre = null;
        while(cur != null){
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
