package com.yangmao;

/**
 * Definition for singly-linked list.
 * 单向链表
 *
 * @author : yangming
 * @date : 2019/9/17
 */
public class ListNode {

    public int val;

    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return val + "";
    }
}
