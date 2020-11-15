package org.bing.learn.数据结构.队列;

public interface Queue<E> {
    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E getFront();
}
