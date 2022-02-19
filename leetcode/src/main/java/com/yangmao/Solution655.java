package com.yangmao;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author yangming
 * @date 2020/7/30
 */
public class Solution655 {

    public List<List<String>> printTree(com.yangming.leetcode.TreeNode root) {
        List<List<String>> list = new ArrayList<>();
        Queue<com.yangming.leetcode.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        do {

        } while (queue.isEmpty());
        this.printSingleLevel(list, root);
        return list;
    }

    private void printSingleLevel(List<List<String>> list, com.yangming.leetcode.TreeNode node) {

    }

}
