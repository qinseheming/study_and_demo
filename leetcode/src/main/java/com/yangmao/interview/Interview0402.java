package com.yangmao.interview;

import com.yangming.leetcode.TreeNode;
import com.yangming.leetcode.util.ArrayUtils;

/**
 * @author yangming
 * @date 2020/7/30
 */
public class Interview0402 {

    public static void main(String[] args) {
        int[] nums = ArrayUtils.createInt("-10,-3,0,5,9");
        Interview0402 interview0402 = new Interview0402();
        com.yangming.leetcode.TreeNode treeNode = interview0402.sortedArrayToBST(nums);
        System.out.println(treeNode);
    }

    public com.yangming.leetcode.TreeNode sortedArrayToBST(int[] nums) {
        BST bst = new BST();
        for (int num : nums) {
            bst.add(num);
        }
        return bst.root;
    }

    class BST{
        com.yangming.leetcode.TreeNode root;

        public void add(int e) {
            root = this.add(root, e);
        }

        private com.yangming.leetcode.TreeNode add(com.yangming.leetcode.TreeNode node, int e) {
            if (node == null) {
                node = new com.yangming.leetcode.TreeNode(e);
            }
            if (e < node.val) {
                node.left = this.add(node.left, e);
            } else if (e > node.val) {
                node.right = this.add(node.right, e);
            }
            return node;
        }
    }
}
