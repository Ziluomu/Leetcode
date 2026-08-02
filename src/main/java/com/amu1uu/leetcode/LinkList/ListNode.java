package com.amu1uu.leetcode.LinkList;

/**
 * @author amu1uu
 * {@code @date } 2026年08月02日 21:15
 */
public class ListNode {
    int val;
    ListNode next;

    // 无参构造
    ListNode() {
    }

    // 有参构造
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

