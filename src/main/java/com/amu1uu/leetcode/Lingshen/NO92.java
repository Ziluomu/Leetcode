package com.amu1uu.leetcode.Lingshen;

import com.amu1uu.leetcode.LinkList.ListNode;

import java.util.List;

/**
 * @author amu1uu
 * {@code @date } 2026年08月17日 22:24
 */

public class NO92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        ListNode pre = null,nxt = null;
        int i = 0;
        for (; i < left; i++) { //i = left时 为第一个需进行反转的节点
            nxt = cur.next;
            pre = cur;
            cur = cur.next;
        }
        ListNode p_l = pre; // left前面那个点，反转后要接上反转后的头
        ListNode p_r = cur;

        pre = null;  // 重置pre指针，避免进入反转循环

        for(;i <= right;i++){
            nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }

        p_l.next = pre; //区间前面 →反转之后新头部
        p_r.next = cur; //反转后的尾部 →right后面第一个结点


        return dummy.next;
    }
}
