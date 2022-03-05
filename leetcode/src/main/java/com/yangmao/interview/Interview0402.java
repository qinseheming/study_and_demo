package com.yangmao.interview;


import com.yangmao.TreeNode;
import com.yangmao.util.ArrayUtils;

/**
 * @author yangming
 * @date 2020/7/30
 */
public class Interview0402 {

    public static void main(String[] args) {
        int[] nums = ArrayUtils.createInt("-10,-3,0,5,9");
        Interview0402 interview0402 = new Interview0402();
        TreeNode treeNode = interview0402.sortedArrayToBST(nums);
        System.out.println(treeNode);
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        BST bst = new BST();
        for (int num : nums) {
            bst.add(num);
        }
        return bst.root;
    }

    class BST{
        TreeNode root;

        public void add(int e) {
            root = this.add(root, e);
        }

        private TreeNode add(TreeNode node, int e) {
            if (node == null) {
                node = new TreeNode(e);
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
