package org.bing.learn.数据结构.集合;

public interface Set<E> {
    boolean isEmpty();
    int getSize();
    void add(E e);
    void remove(E e);
    boolean contains(E e);
}
