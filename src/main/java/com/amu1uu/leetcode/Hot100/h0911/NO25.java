package com.amu1uu.leetcode.Hot100.h0911;

/**
 * @author amu1uu
 * {@code @date } 2026年09月11日 11:04
 */

import com.amu1uu.leetcode.Lingshen.TreeNode;
import com.amu1uu.leetcode.LinkList.ListNode;

import java.util.List;

/**  K 个一组翻转链表
 * 给你链表的头节点 head ，每 k 个节点一组进行翻转，请你返回修改后的链表。
 *
 * k 是一个正整数，它的值小于或等于链表的长度。如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际进行节点交换。
 */
public class NO25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0,head),lastTail = dummy;
        while(true){
            ListNode cur = lastTail;
            for (int i = 0; i < k; i++) {
                cur = cur.next;
                if(cur == null){
                    return dummy.next;
                }
            }

            ListNode pre = null;
            cur = lastTail.next;
            for (int i = 0; i < k; i++) {
                ListNode nxt = cur.next;
                cur.next = pre;
                pre = cur;
                cur = nxt;
            }

            ListNode tail = lastTail.next;
            tail.next = cur;
            lastTail.next = pre;
            lastTail = tail;
        }
    }
}
