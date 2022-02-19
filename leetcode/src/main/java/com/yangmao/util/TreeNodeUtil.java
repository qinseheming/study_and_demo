package com.yangmao.util;

import com.yangming.leetcode.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

/**
 * @author yangming
 * @date 2020/8/3
 */
public class TreeNodeUtil {

    public static TreeNode createTree(List<Integer> nums) {
        if (nums.size() == 0) {
            return null;
        }
        TreeNode head = new TreeNode(nums.get(0));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        int index = 0;
        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            int leftIndex = 2 * index + 1;
            int rightIndex = 2 * index + 2;
            index++;
            if (leftIndex < nums.size()) {
                Integer leftVal = nums.get(leftIndex);
                if (leftVal != null) {
                    node.left = new TreeNode(leftVal);
                }
            }
            if (rightIndex < nums.size()) {
                Integer rightVal = nums.get(rightIndex);
                if (rightVal != null) {
                    node.right = new TreeNode(nums.get(rightIndex));
                }
            }

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
        return head;
    }

    public static TreeNode createTree(String s) {

        List<Integer> list = Arrays.stream(s.split(",")).map(it -> {
            if ("null".equals(it)) {
                return null;
            } else {
                return Integer.parseInt(it);
            }
        }).collect(Collectors.toList());
        return createTree(list);
    }

}
