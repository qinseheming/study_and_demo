package com.yangmao;

/**
 * 617. 合并二叉树 https://leetcode-cn.com/problems/merge-two-binary-trees/
 *
 * @author yangming
 * @date 2019/11/2
 */
public class Solution617 {

    public static com.yangming.leetcode.TreeNode mergeTrees(com.yangming.leetcode.TreeNode t1, com.yangming.leetcode.TreeNode t2) {
//        t1.val = t1.val + t2.val;
//        mergeTrees(t1.left, t1.right);
//        mergeTrees(t2.left, t2.right);
        return t1;
    }

    public static void main(String[] args) {
        com.yangming.leetcode.TreeNode t1 = new com.yangming.leetcode.TreeNode(1);
        com.yangming.leetcode.TreeNode tl1 = new com.yangming.leetcode.TreeNode(3);
        com.yangming.leetcode.TreeNode tl2 = new com.yangming.leetcode.TreeNode(5);
        com.yangming.leetcode.TreeNode tr1 = new com.yangming.leetcode.TreeNode(2);
        t1.left = tl1;
        tl1.left = tl2;
        t1.right = tr1;

        com.yangming.leetcode.TreeNode t2 = new com.yangming.leetcode.TreeNode(2);
        com.yangming.leetcode.TreeNode t2l1 = new com.yangming.leetcode.TreeNode(1);
        com.yangming.leetcode.TreeNode t2l2 = new com.yangming.leetcode.TreeNode(4);
        com.yangming.leetcode.TreeNode t2r1 = new com.yangming.leetcode.TreeNode(3);
        com.yangming.leetcode.TreeNode t2r2 = new com.yangming.leetcode.TreeNode(7);
        t2.left = t2l1;
        t2l1.right = t2l2;
        t2.right = t2r1;
        t2r1.right = t2r2;

        System.out.println(mergeTrees(t1, t2));
    }
}
