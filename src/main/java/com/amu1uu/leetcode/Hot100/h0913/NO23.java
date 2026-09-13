package com.amu1uu.leetcode.Hot100.h0913;

import com.amu1uu.leetcode.LinkList.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @author amu1uu
 * {@code @date } 2026年09月13日 14:29
 */

/** 合并 K 个升序链表
 * 给你一个链表数组，每个链表都已经按升序排列。
 *
 * 请你将所有链表合并到一个升序链表中，返回合并后的链表。
 */
public class NO23 {
    public ListNode mergeKLists(ListNode[] lists) {
        Queue<ListNode> pq =  new PriorityQueue<>((node1, node2) ->node1.val -node2.val);
        for(ListNode node : lists){
            if(node != null){
                pq.offer(node);
            }
        }
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        while(!pq.isEmpty()){
            ListNode minNode = pq.poll();
            tail.next = minNode;
            tail = minNode;
            if(minNode.next != null){
                pq.offer(minNode.next);
            }
        }
        return dummy.next;
    }
}
