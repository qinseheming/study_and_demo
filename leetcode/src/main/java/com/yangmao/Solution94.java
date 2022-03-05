package com.yangmao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Solution94 {

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
        queue.add(node.val);
        put(queue, node.right);
    }

}
