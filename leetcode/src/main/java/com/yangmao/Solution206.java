package com.yangmao;

import java.util.Stack;

/**
 * @author yang
 */
public class Solution206 {

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }
        head = new ListNode(stack.pop());
        ListNode result = head;
        while (!stack.isEmpty()) {
            ListNode node = new ListNode(stack.pop());
            head.next = node;
            head = node;
        }
        return result;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode pre = head;
        ListNode curr = head.next;
        ListNode next;
        while (curr != null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        head.next = null;
        head = pre;
        return head;
    }

}
