package com.yangmao;

/**
 * @author yangming
 * @date 2020/8/17
 */
public class Solution110 {

    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(getLevel(root.left) - getLevel(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);
    }

    private int getLevel(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }else {
            return Math.max(getLevel(treeNode.left), getLevel(treeNode.right)) + 1;
        }
    }
}
