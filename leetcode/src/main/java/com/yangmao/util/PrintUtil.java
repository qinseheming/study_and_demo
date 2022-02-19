package com.yangmao.util;

import com.yangming.leetcode.ListNode;
import com.yangming.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yangming
 * @date 2019/10/29
 */
public class PrintUtil {

    public static void printListNode(ListNode listNode) {
        ListNode list = listNode;
        while (list != null) {
            System.out.print(list);
            if (list.next != null) {
                System.out.print(" -> ");
            }
            list = list.next;
        }
    }

    public static void printArray(int[] arr) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i : arr) {
            builder.append(i).append(", ");
        }
        builder.deleteCharAt(builder.lastIndexOf(", "));
        builder.append("]");
        System.out.println(builder.toString());
    }

    public static void printArray(String[] arr) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (String i : arr) {
            builder.append(i).append(", ");
        }
        builder.deleteCharAt(builder.lastIndexOf(", "));
        builder.append("]");
        System.out.println(builder.toString());
    }

    public static void printTree(com.yangming.leetcode.TreeNode root) {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        builder.append(root.val).append(",");
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            com.yangming.leetcode.TreeNode node = queue.remove();
            if (node.left != null) {
                queue.add(node.left);
                builder.append(node.left.val);
            } else {
                builder.append("null");
            }
            builder.append(",");
            if (node.right != null) {
                queue.add(node.right);
                builder.append(node.right.val);
            } else {
                builder.append("null");
            }
            builder.append(",");
        }
        builder.append("]");
        System.out.println(builder.toString());
    }

}
