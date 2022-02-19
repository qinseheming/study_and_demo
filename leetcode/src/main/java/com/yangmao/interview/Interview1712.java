package com.yangmao.interview;

import com.yangming.leetcode.TreeNode;
import com.yangming.leetcode.util.PrintUtil;
import com.yangming.leetcode.util.TreeNodeUtil;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author yangming
 * @date 2020/8/3
 */
public class Interview1712 {

    public com.yangming.leetcode.TreeNode convertBiNode(com.yangming.leetcode.TreeNode root) {
        if (root == null) {
            return null;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<TreeNode> newQueue = new LinkedList<>();
        queue.add(root);
        com.yangming.leetcode.TreeNode head = null;
        while (!queue.isEmpty()) {
            com.yangming.leetcode.TreeNode node = queue.remove();
            com.yangming.leetcode.TreeNode left = node.left;
            com.yangming.leetcode.TreeNode right = node.right;
            if (right != null) {
                queue.add(node.right);
            }
            if (left != null) {
                queue.add(node.left);
            }
            newQueue.add(node);
        }
        while (!newQueue.isEmpty()) {
            com.yangming.leetcode.TreeNode node = newQueue.remove();
            com.yangming.leetcode.TreeNode left = node.left;
            com.yangming.leetcode.TreeNode right = node.right;
            if (right != null) {
                while (right.left != null && right.right.val != null) {
                    right = right.left;
                }
                node.right = right;
            }
            if (left != null) {
                while (left.right != null) {
                    left = left.right;
                }
                node.left = null;
                left.right = node;
                head = left;
            } else {
                head = node;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        com.yangming.leetcode.TreeNode treeNode = TreeNodeUtil.createTree("4,2,5,1,3,null,6,0");
        Interview1712 interview1712 = new Interview1712();
        com.yangming.leetcode.TreeNode node = interview1712.convertBiNode(treeNode);
        PrintUtil.printTree(node);
    }


}
