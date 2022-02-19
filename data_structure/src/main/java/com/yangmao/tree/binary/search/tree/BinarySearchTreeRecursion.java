package com.yangmao.tree.binary.search.tree;

/**
 * 递归方式实现二叉树
 *
 * @author yangming
 * @date 2020/7/29
 */
public class BinarySearchTreeRecursion<E extends Comparable<E>> extends AbstractBinarySearchTree<E> {

    /**
     * 向二叉树中添加元素，如果元素已存在则不做任何操作
     *
     * @param e 要添加的元素
     */
    @Override
    public void add(E e) {
        root = this.add(root, e);
    }

    /**
     * 查找二叉树中是否有该元素
     *
     * @param e 要查找的元素
     * @return 是否有该元素
     */
    @Override
    public boolean contains(E e) {
        return this.contains(root, e);
    }


    /**
     * 前序遍历
     */
    @Override
    public void preOrder() {
        this.preOrder(root);
    }

    /**
     * 中序遍历
     */
    @Override
    public void inOrder() {
        this.inOrder(root);
    }

    /**
     * 后序遍历
     */
    @Override
    public void postOrder() {
        this.postOrder(root);
    }

    @Override
    public void levelOrder() {

    }

    @Override
    public E minimum() {
        return minimum(root);
    }

    @Override
    public E maximum() {
        return maximum(root);
    }

    @Override
    public E removeMin() {
        E minimum = minimum();
        root = removeMin(root);
        return minimum;
    }

    @Override
    public E removeMax() {
        E max = maximum();
        root.right = this.removeMax(root);
        return max;
    }

    @Override
    public boolean remove(E e) {
        return false;
    }

    @Override
    public int getHeight() {
        return getHeight(root);
    }

    private int getHeight(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(node.left), getHeight(node.right));
    }

    private Node removeMax(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        }
        node.right = this.removeMax(node.right);
        return node;
    }

    /**
     * 删除当前树的最小节点，返回删除节点后新的树的根
     *
     * @param node 当前树的根节点
     * @return 除节点后新的树的根
     */
    private Node removeMin(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        }
        node.left = removeMin(node.left);
        return node;
    }

    private E maximum(Node node) {
        if (node.right == null) {
            return node.e;
        }
        return maximum(node.right);
    }

    private E minimum(Node node) {
        if (node.left == null) {
            return node.e;
        }
        return minimum(node.left);
    }


    private Node add(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0) {
            node.left = this.add(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = this.add(node.right, e);
        }
        return node;
    }

    private boolean contains(Node node, E e) {
        if (node == null) {
            return false;
        }
        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return this.contains(node.left, e);
        } else {
            return this.contains(node.right, e);
        }
    }

    private void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.println(node.e);
        this.preOrder(node.left);
        this.preOrder(node.right);
    }

    private void inOrder(Node node) {
        if (node == null) {
            return;
        }
        this.inOrder(node.left);
        System.out.println(node.e);
        this.inOrder(node.right);
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }
        this.postOrder(node.left);
        this.postOrder(node.right);
        System.out.println(node.e);
    }

}
