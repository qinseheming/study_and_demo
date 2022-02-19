package com.yangmao;

/**
 * 有序链表转换二叉搜索树
 *
 * 给定的有序链表： [-10, -3, 0, 5, 9],
 *
 * 一个可能的答案是：[0, -3, 9, -10, null, 5], 它可以表示下面这个高度平衡二叉搜索树：
 *
 *       0
 *      / \
 *    -3   9
 *    /   /
 *  -10  5
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author yangming
 * @date 2020/8/18
 */
public class Solution109 {

    public com.yangming.leetcode.TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return sortedListToBST(head, null);
    }

    private com.yangming.leetcode.TreeNode sortedListToBST(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }
        ListNode midNode = getMid(left, right);
        com.yangming.leetcode.TreeNode head = new com.yangming.leetcode.TreeNode(midNode.val);
        head.left = sortedListToBST(left, midNode);
        head.right = sortedListToBST(midNode.next, right);
        return head;
    }

    public ListNode getMid(ListNode left, ListNode right) {
        ListNode fastNode = left;
        ListNode slowNode = left;
        while (fastNode != right && fastNode.next != right) {
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return slowNode;
    }

}
