package com.yangmao.set;

/**
 * 集合
 *
 * @author yangming
 * @date 2020/7/30
 */
public interface Set<E> {

    void add(E e);

    boolean contains(E e);

    void remove(E e);

    int size();

    boolean isEmpty();
}
