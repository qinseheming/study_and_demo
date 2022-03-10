package com.yangmao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

/**
 * @author yangming
 * @date 2019/12/16
 */
public class Solution589 {

    public List<Integer> preorder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        put(queue, root);
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll().val);
        }
        return result;
    }

    private void put(Queue<Node> queue, Node root) {
        if (root == null) {
            return;
        }
        queue.add(root);
        List<Node> children = root.children;
        if (children != null && !children.isEmpty()) {
            for (Node child : children) {
                put(queue, child);
            }
        }
    }


}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
