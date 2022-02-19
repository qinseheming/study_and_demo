package com.yangmao;

import com.yangming.leetcode.node.Node;

import java.util.List;

/**
 * @author yangming
 * @date 2020/7/30
 */
public class Solution559 {

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        List<Node> nodeList = root.children;
        int maxDepth = 0;
        for (Node node : nodeList) {
            int deep = 1 + this.maxDepth(node);
            maxDepth = Math.max(deep, maxDepth);
        }
        return maxDepth;
    }



}
