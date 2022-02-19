package com.yangmao;

/**
 * 2. 两数相加 https://leetcode-cn.com/problems/add-two-numbers/
 *
 * @author : yangming
 * @date : 2019/9/17
 */
public class Solution2 {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null) {
            throw new IllegalArgumentException("参数不能为null");
        }
        ListNode dummyNode = new ListNode(0);
        ListNode curr = dummyNode;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }
        if (carry == 1) {
            curr.next = new ListNode(carry);
        }
        return dummyNode.next;
    }

    public static void main(String[] args) {
        ListNode node11 = new ListNode(2);
        ListNode node12 = new ListNode(4);
        ListNode node13 = new ListNode(3);
        node11.next = node12;
        node12.next = node13;

        ListNode node21 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node23 = new ListNode(4);
        node21.next = node22;
        node22.next = node23;

        ListNode resultNode = addTwoNumbers(node11, node21);

        printListNode(resultNode);
    }

    private static void printListNode(ListNode resultNode) {
        while (true) {
            if (resultNode != null) {
                System.out.print(resultNode.val);
                resultNode = resultNode.next;
            } else {
                break;
            }
        }
    }

    /**
     * 传递数组，构建链表
     * @param values
     * @return
     */
//    private static ListNode buildListNode(int[] values) {
//        if (values == null || values.length == 0) {
//            throw new IllegalArgumentException("数组为空");
//        }
//        ListNode first = new ListNode(values[0]);
//        if (values.length == 1) {
//            return first;
//        } else {
//            ListNode next = null;
//            first.next = next;
//            for (int i = 1; i < values.length; i++) {
//                next = new ListNode(values[i]);
//                next.next = next;
//            }
//        }
//        return first;
//    }
}
