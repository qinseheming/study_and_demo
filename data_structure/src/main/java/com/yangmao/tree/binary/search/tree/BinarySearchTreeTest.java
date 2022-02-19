package com.yangmao.tree.binary.search.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author yangming
 * @date 2020/7/29
 */
public class BinarySearchTreeTest {

    public static void main(String[] args) {
        testBinarySearchTreeRecursion();
//        testBinarySearchTreeNotRecursion();
//        testRemove();
    }

    /**
     * 递归二分搜索树
     */
    private static void testBinarySearchTreeRecursion() {
        AbstractBinarySearchTree<Integer> tree = new BinarySearchTreeRecursion<>();
        int[] arr = new int[]{5, 3, 6, 8, 4, 2};
        for (int i : arr) {
            tree.add(i);
        }
        System.out.println(tree);
    }

    /**
     * 非递归二分搜索树
     */
    private static void testBinarySearchTreeNotRecursion() {
        AbstractBinarySearchTree<Integer> tree2 = new BinarySearchTreeNotRecursion<>();
        int[] arr2 = new int[]{5, 3, 6, 8, 4, 2};
        for (int i : arr2) {
            tree2.add(i);
        }
        tree2.preOrder();
        System.out.println();
        tree2.levelOrder();
        System.out.println("最小值：" + tree2.minimum());
    }

    private static void testRemove() {
        AbstractBinarySearchTree<Integer> tree = new BinarySearchTreeRecursion<>();
        int n = 1000;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            tree.add(random.nextInt(10000));
        }
        List<Integer> list = new ArrayList<>();
        while (!tree.isEmpty()) {
            list.add(tree.removeMin());
        }
        System.out.println(list);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < list.get(i - 1)) {
                throw new RuntimeException("");
            }
        }
        System.out.println("run success");
    }

}
