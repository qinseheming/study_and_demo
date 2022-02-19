package com.yangmao.iterator;

/**
 * @author yang
 */
public interface MyIterator<T> {

    void first();

    void last();

    T next();

    boolean hasNext();

}
