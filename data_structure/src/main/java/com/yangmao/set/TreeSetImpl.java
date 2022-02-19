package com.yangmao.set;

import com.yangming.data_structure.tree.binary.search.tree.AbstractBinarySearchTree;
import com.yangming.data_structure.tree.binary.search.tree.BinarySearchTreeRecursion;

/**
 * 底层以二叉搜索树的方式实现集合
 *
 * @author yangming
 * @date 2020/7/30
 */
public class TreeSetImpl<E extends Comparable<E>> implements Set<E> {

    AbstractBinarySearchTree<E> tree;

    public TreeSetImpl() {
        this.tree = new BinarySearchTreeRecursion<>();
    }

    @Override
    public void add(E e) {
        tree.add(e);
    }

    @Override
    public boolean contains(E e) {
        return tree.contains(e);
    }

    @Override
    public void remove(E e) {
        this.tree.remove(e);
    }

    @Override
    public int size() {
        return this.tree.size();
    }

    @Override
    public boolean isEmpty() {
        return this.tree.isEmpty();
    }
}
