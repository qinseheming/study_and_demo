package com.yangmao.tree.binary.search.tree;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 非递归方式实现二叉树
 *
 * @author yangming
 * @date 2020/7/29
 */
public class BinarySearchTreeNotRecursion<E extends Comparable<E>> extends AbstractBinarySearchTree<E> {

    /**
     * 向二叉树中添加元素，如果元素已存在则不做任何操作
     *
     * @param e 要添加的元素
     */
    @Override
    public void add(E e) {
        if (root == null) {
            size++;
            root = new Node(e);
            return;
        }
        Node node = root;
        Node pre = null;
        while (node != null) {
            pre = node;
            if (e.compareTo(node.e) < 0) {
                node = node.left;
            } else if (e.compareTo(node.e) > 0) {
                node = node.right;
            } else {
                return;
            }
        }
        node = new Node(e);
        if (e.compareTo(pre.e) < 0) {
            pre.left = node;
            size++;
        } else if (e.compareTo(pre.e) > 0) {
            pre.right = node;
            size++;
        }
    }

    /**
     * 查找二叉树中是否有该元素
     *
     * @param e 要查找的元素
     * @return 是否有该元素
     */
    @Override
    public boolean contains(E e) {
        return false;
    }


    /**
     * 前序遍历
     */
    @Override
    public void preOrder() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node.e);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    /**
     * 中序遍历
     */
    @Override
    public void inOrder() {

    }

    /**
     * 后序遍历
     */
    @Override
    public void postOrder() {

    }

    /**
     * 层序遍历
     */
    @Override
    public void levelOrder() {
        Queue<Node> queue = new LinkedBlockingQueue<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            System.out.println(node.e);
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    @Override
    public E minimum() {
        if (root == null) {
            return null;
        }
        Node node = root;
        while (node.left != null) {
            node = node.left;
        }
        return node.e;
    }

    @Override
    public E maximum() {
        return null;
    }

    @Override
    public E removeMin() {
        return null;
    }

    @Override
    public E removeMax() {
        return null;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public int getHeight() {
        return 0;
    }


}
