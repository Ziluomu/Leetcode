package com.amu1uu.leetcode.Hot100.h0910;

/**
 * @author amu1uu
 * {@code @date } 2026年09月10日 10:14
 */

import com.amu1uu.leetcode.LinkList.ListNode;

import java.util.List;

/** 合并两个有序链表
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 */
public class NO21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        while(list1 != null && list2 !=null){
            if(list1.val < list2.val){
                cur.next = list1;
                list1 = list1.next;
            } else  {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        cur.next = list1 != null ? list1 : list2;
        return dummy.next;
    }
}
