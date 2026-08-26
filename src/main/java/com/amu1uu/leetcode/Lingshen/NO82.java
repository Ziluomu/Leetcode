package com.amu1uu.leetcode.Lingshen;

/**
 * @author amu1uu
 * {@code @date } 2026年08月26日 13:17
 */

/**
 * 给定一个已排序的链表的头 head ， 删除原始链表中所有重复数字的节点，只留下不同的数字 。返回 已排序的链表 。
 */
public class NO82 {
        public ListNode deleteDuplicates(ListNode head) {
            ListNode dummy= new ListNode(0,head);
            ListNode pre = dummy,cur = head;
            while(cur != null && cur.next != null ){
                if (cur.val == cur.next.val) {
                    while(cur.next != null &&cur.val == cur.next.val){
                        cur = cur.next;
                    }
                    cur = cur.next;
                    pre.next = cur;
                } else{
                    pre = cur;
                    cur = cur.next;
                }
            }
            return dummy.next;
        }
}
