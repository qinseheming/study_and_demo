package com.yangmao;

/**
 * 617. 合并二叉树 https://leetcode-cn.com/problems/merge-two-binary-trees/
 *
 * @author yangming
 * @date 2019/11/2
 */
public class Solution617 {

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
//        t1.val = t1.val + t2.val;
//        mergeTrees(t1.left, t1.right);
//        mergeTrees(t2.left, t2.right);
        return t1;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode tl1 = new TreeNode(3);
        TreeNode tl2 = new TreeNode(5);
        TreeNode tr1 = new TreeNode(2);
        t1.left = tl1;
        tl1.left = tl2;
        t1.right = tr1;

        TreeNode t2 = new TreeNode(2);
        TreeNode t2l1 = new TreeNode(1);
        TreeNode t2l2 = new TreeNode(4);
        TreeNode t2r1 = new TreeNode(3);
        TreeNode t2r2 = new TreeNode(7);
        t2.left = t2l1;
        t2l1.right = t2l2;
        t2.right = t2r1;
        t2r1.right = t2r2;

        System.out.println(mergeTrees(t1, t2));
    }
}
