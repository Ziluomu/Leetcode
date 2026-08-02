package com.amu1uu.leetcode.LinkList;

/**
 * @author amu1uu
 * {@code @date } 2026年08月02日 21:36
 */

import java.util.List;

/**
 * 你可以选择使用单链表或者双链表，设计并实现自己的链表。
 *
 * 单链表中的节点应该具备两个属性：val 和 next 。val 是当前节点的值，next 是指向下一个节点的指针/引用。
 *
 * 如果是双向链表，则还需要属性 prev 以指示链表中的上一个节点。假设链表中的所有节点下标从 0 开始。
 *
 * 实现 MyLinkedList 类：
 *
 * MyLinkedList() 初始化 MyLinkedList 对象。
 * int get(int index) 获取链表中下标为 index 的节点的值。如果下标无效，则返回 -1 。
 * void addAtHead(int val) 将一个值为 val 的节点插入到链表中第一个元素之前。在插入完成后，新节点会成为链表的第一个节点。
 * void addAtTail(int val) 将一个值为 val 的节点追加到链表中作为链表的最后一个元素。
 * void addAtIndex(int index, int val) 将一个值为 val 的节点插入到链表中下标为 index 的节点之前。如果 index 等于链表的长度，那么该节点会被追加到链表的末尾。如果 index 比长度更大，该节点将 不会插入 到链表中。
 * void deleteAtIndex(int index) 如果下标有效，则删除链表中下标为 index 的节点。
 *
 */
public class NO707 {
    private int size;
    private ListNode head;

    public NO707() {
        this.size = 0;
        this.head = new ListNode(0);
    }

    public int get(int index) {
// * int get(int index) 获取链表中下标为 index 的节点的值。如果下标无效，则返回 -1 。
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cur = head.next;
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        return cur.val;
    }

    public void addAtHead(int val) {
// * void addAtHead(int val) 将一个值为 val 的节点插入到链表中第一个元素之前。在插入完成后，新节点会成为链表的第一个节点。
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        size++;
    }

    public void addAtTail(int val) {
// * void addAtTail(int val) 将一个值为 val 的节点追加到链表中作为链表的最后一个元素。
        ListNode tail = new ListNode(val);
        ListNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = tail;
        size++;
    }

    public void addAtIndex(int index, int val) {
// * void addAtIndex(int index, int val) 将一个值为 val 的节点插入到链表中下标为 index 的节点之前。
// 如果 index 等于链表的长度，那么该节点会被追加到链表的末尾。如果 index 比长度更大，该节点将 不会插入 到链表中。
        if (index < 0) index = 0;
        if (index > size) return;

        ListNode newNode = new ListNode(val);
        ListNode cur = head;
        for (int i = 0; i < index; i++) {
            if (cur == null) {
                return;
            }
            cur = cur.next;
        }
        if (cur == null) {
            return;
        }
        newNode.next = cur.next;
        cur.next = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
// * void deleteAtIndex(int index) 如果下标有效，则删除链表中下标为 index 的节点。
        if (index < 0 || index >= size) {
            return;
        }
        ListNode pre = head;
        ListNode cur = head.next;
        for (int i = 0; i < index; i++) {
            if (cur == null) {
                return;
            } else {

                pre = cur;
                cur = cur.next;
            }
        }
        if (cur != null) {
            // 删除核心语句：前驱节点跳过待删节点
            pre.next = cur.next;
            size--;
        }
    }
}
