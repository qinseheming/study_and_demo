package com.yangmao;


import com.yangmao.util.PrintUtil;

/**
 * 237. 删除链表中的节点 https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 *
 * @author yangming
 * @date 2019/10/29
 */
public class Solution237 {

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;

        deleteNode(listNode2);
        PrintUtil.printListNode(listNode1);

    }
}
