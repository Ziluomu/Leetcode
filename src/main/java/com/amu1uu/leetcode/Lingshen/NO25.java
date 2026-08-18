package com.amu1uu.leetcode.Lingshen;

import com.amu1uu.leetcode.LinkList.ListNode;

import java.util.List;

/**
 * @author amu1uu
 * {@code @date } 2026年08月17日 22:45
 */
public class NO25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        while(temp != null){  // 求解链表长度
            temp = temp.next;
            len++;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode p0 = dummy;

        while(len >= k){
            len = len - k; // 剩余未进行反转的链表部分的长度
            int i = 0;
            ListNode pre = null,nxt = null;
            ListNode cur = p0.next; // 当次反转的末尾节点，原序列的第一个反转节点
            for (;i < k ; i++ ){ // 进行反转
                nxt = cur.next;
                cur.next = pre;
                pre = cur;
                cur = nxt;
            }

            ListNode p1 = p0.next; // 当次反转的末尾节点，原序列的第一个反转节点
            p1.next = cur;
            p0.next = pre;
            p0 = p1;
        }
        return dummy.next;

    }
}
