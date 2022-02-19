package com.yangmao.util;

import com.yangming.leetcode.ListNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author yangming
 * @date 2020/7/4
 */
public class ListNodeUtil {

    /**
     * 创建单向链表
     * @param listNodeStr eg：a->b->c->d->e->f
     * @return 单向链表头结点
     */
    public static com.yangming.leetcode.ListNode createListNode(String listNodeStr) {
        String[] split = listNodeStr.split("->");
        List<Integer> list = Arrays.stream(split).map(Integer::parseInt).collect(Collectors.toList());
        com.yangming.leetcode.ListNode head = new com.yangming.leetcode.ListNode(list.get(0));
        com.yangming.leetcode.ListNode node;
        for (int i = 1; i < list.size(); i++) {
            node = new com.yangming.leetcode.ListNode(list.get(i));
            if (i == 1) {
                head.next = node;
            }

        }
        return head;
    }

    public static void print(com.yangming.leetcode.ListNode node) {
        List<Integer> list = new ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        String result = list.stream().map(Object::toString).collect(Collectors.joining(" --> "));
        System.out.println(result);
    }
}
