package com.amu1uu.leetcode.Lingshen;

import com.amu1uu.leetcode.LinkList.ListNode;

import java.util.List;

/**
 * @author amu1uu
 * {@code @date } 2026年08月18日 14:15
 */
public class NO876 {
    public ListNode middleNode(ListNode head) {
        // 123
        // 1234
        ListNode slow = null;
        ListNode fast = null;
        slow = head;
        fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
