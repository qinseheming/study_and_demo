package com.yangmao.tree.segment.tree;

import java.util.function.BiFunction;

/**
 * 线段树
 *
 * @author yangming
 * @date 2020/7/31
 */
public class SegmentTree<E> {
    /**
     * 初始化的值
     */
    E[] data;

    /**
     * 线段树转数组
     */
    E[] tree;

    private BiFunction<E, E, E> merger;

    public SegmentTree(E[] data, BiFunction<E, E, E> biFunction) {
        this.merger = biFunction;
        this.data = (E[]) new Object[data.length];
        System.arraycopy(data, 0, this.data, 0, data.length);
        this.tree = (E[]) new Object[4 * data.length];
        buildSegmentTree(0, 0, data.length - 1);
    }

    private void buildSegmentTree(int index, int left, int right) {
        if (left == right) {
            tree[index] = data[left];
            return;
        }

        int leftChildIndex = leftChild(index);
        int rightChildIndex = rightChild(index);
        int mid = left + (right - left) / 2;
        buildSegmentTree(leftChildIndex, left, mid);
        buildSegmentTree(rightChildIndex, mid + 1, right);

        tree[index] = merger.apply(tree[leftChildIndex], tree[rightChildIndex]);
    }

    /**
     * 获取当前线段树中的数组长度
     *
     * @return 当前线段树中数组长度
     */
    public int getSize() {
        return this.data.length;
    }

    public E get(int index) {
        return this.data[index];
    }


    /**
     * 获取当前索引节点的左孩子
     *
     * @param index 当前索引
     * @return 左孩子
     */
    public int leftChild(int index) {
        return 2 * index + 1;
    }

    /**
     * 获取当前索引节点的右孩子
     *
     * @param index 当前索引
     * @return 右孩子
     */
    public int rightChild(int index) {
        return 2 * index + 2;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[");
        for (int i = 0; i < tree.length; i++) {
            if (tree[i] == null) {
                builder.append("null");
            } else {
                builder.append(tree[i]);
            }
            if (i != tree.length - 1) {
                builder.append(", ");
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
