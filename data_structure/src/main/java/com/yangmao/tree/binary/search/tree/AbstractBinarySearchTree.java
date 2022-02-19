package com.yangmao.tree.binary.search.tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 二分搜索树
 * 从小到大排列
 * // TODO 重新实现一遍二叉搜索树
 *
 * @author yangming
 * @date 2020/7/29
 */
public abstract class AbstractBinarySearchTree<E extends Comparable<E>> {

    protected class Node {
        public E e;
        public Node left;
        public Node right;

        public Node(E e) {
            this.e = e;
        }
    }

    /**
     * 根节点
     */
    protected Node root;

    /**
     * 当前二分搜索树数据量
     */
    protected int size;

    /**
     * 返回当前二叉树数据量
     *
     * @return 当前二叉树数据量
     */
    public int size() {
        return size;
    }

    /**
     * 当前二叉树中是否为空
     *
     * @return 当前二叉树中是否为空
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * 向二叉树中添加元素，如果元素已存在则不做任何操作
     *
     * @param e 要添加的元素
     */
    public abstract void add(E e);

    /**
     * 查找二叉树中是否有该元素
     *
     * @param e 要查找的元素
     * @return 是否有该元素
     */
    public abstract boolean contains(E e);

    /**
     * 前序遍历
     */
    public abstract void preOrder();

    /**
     * 中序遍历
     */
    public abstract void inOrder();

    /**
     * 后序遍历
     */
    public abstract void postOrder();

    /**
     * 层序遍历
     */
    public abstract void levelOrder();

    /**
     * 寻找二分搜索树的最小值
     *
     * @return 二分搜索树的最小值
     */
    public abstract E minimum();

    /**
     * 寻找二分搜索树的最大值
     *
     * @return 二分搜索树的最大值
     */
    public abstract E maximum();

    /**
     * 删除最小值
     *
     * @return 最小值
     */
    public abstract E removeMin();

    /**
     * 删除最大值
     *
     * @return 最大值
     */
    public abstract E removeMax();

    /**
     * 删除指定的元素
     *
     * @param e 要删除的元素
     * @return 是否删除成功
     */
    public abstract boolean remove(E e);

    /**
     * 获取树的高度
     *
     * @return 返回树的高度
     */
    public abstract int getHeight();

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Queue<Node> queue1 = new LinkedList<>();
        queue1.add(root);
        printLevel(queue1, builder);
        return builder.toString();
    }

    private void printLevel(Queue<Node> queue, StringBuilder builder) {
        Queue<Node> newQueue = new LinkedList<>();
        while (!queue.isEmpty()) {
            Node node = queue.remove();
            builder.append(node.e).append(" ");
            if (node.left != null) {
                newQueue.add(node.left);
            }
            if (node.right != null) {
                newQueue.add(node.right);
            }
        }
        builder.append("\n");
        while (!newQueue.isEmpty()) {
            printLevel(newQueue, builder);
        }
    }

}