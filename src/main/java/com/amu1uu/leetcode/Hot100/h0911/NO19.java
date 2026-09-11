package com.amu1uu.leetcode.Hot100.h0911;

import com.amu1uu.leetcode.LinkList.ListNode;

/**
 * @author amu1uu
 * {@code @date } 2026年09月11日 10:25
 */

/** 删除链表的倒数第 N 个结点
 * 给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */
public class NO19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode fast = dummy,slow = dummy;
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        // 找到倒数第N+1个节点。
        slow.next = slow.next.next;
        return dummy.next;
    }
}
