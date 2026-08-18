package com.amu1uu.leetcode.Lingshen;

import com.amu1uu.leetcode.LinkList.ListNode;

/**
 * @author amu1uu
 * {@code @date } 2026年08月17日 22:14
 */
public class NO206 {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode() {}
     *     ListNode(int val) { this.val = val; }
     *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     * }
     */

    public ListNode reverseList(ListNode head) {
        //1 2 3 4 8 2 4 null
        //4 2 8 4 3 2 1
        ListNode cur = head;
        ListNode nxt = null,pre = null;
        while(cur != null){
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
}
