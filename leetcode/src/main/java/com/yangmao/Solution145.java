package com.yangmao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution145 {

    public List<Integer> inorderTraversal(TreeNode root) {
        Queue<Integer> queue = new LinkedList<>();
        put(queue, root);
        return new ArrayList<>(queue);
    }

    private void put(Queue<Integer> queue, TreeNode node) {
        if (node == null) {
            return;
        }
        put(queue, node.left);
        put(queue, node.right);
        queue.add(node.val);
    }

}
