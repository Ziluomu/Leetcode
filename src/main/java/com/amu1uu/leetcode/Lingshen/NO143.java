package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月25日 15:24
 */

import com.amu1uu.leetcode.LinkList.ListNode;

import java.util.List;

/**
 * 给定一个单链表 L 的头节点 head ，单链表 L 表示为：
 *
 * L0 → L1 → … → Ln - 1 → Ln
 * 请将其重新排列后变为：
 *
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * 不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class NO143 {
    public void reorderList(ListNode head) {
        // 分快慢指针，找到链表的中间节点
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre =null;
        while(fast != null && fast.next != null){
            pre = slow;
            slow =slow.next;
            fast = fast.next.next;
        }// 如果fast此时为空，说明链表节点数为奇数，slow此时为中间节点。
        // 如果fast.next为空，说明链表节点数目为偶数，slow为中间两个节点中的靠head的一个
        // 将链表的后半部分进行反转
        ListNode cur = slow;
        pre = null;
        ListNode nxt = null;
        while(cur != null){
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        } // 此时pre指向链表最尾端
        ListNode left = head;
        ListNode right = pre;
        while(right.next != null){
            ListNode lnxt = left.next,rnxt = right.next;
            left.next = right;
            right.next = lnxt;
            left = lnxt;
            right = rnxt;
        }
    }
}
