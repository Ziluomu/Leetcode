package com.amu1uu.leetcode.Lingshen;

import com.amu1uu.leetcode.LinkList.ListNode;

/**
 * @author amu1uu
 * {@code @date } 2026年08月18日 14:22
 */
public class NO141 {
        public boolean hasCycle(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (fast == slow) {
                    return true;
                }
            }
            return false; // 访问到了链表末尾，无环
        }
}
