package org.bing.learn.数据结构.栈;

public interface Stack<E> {
    /** 元素个数 **/
    int getSize();

    /** 是否为空 **/
    boolean isEmpty();

    /** 添加元素 **/
    void push(E e);

    /** 删除元素 **/
    E pop();

    /** 栈顶元素 **/
    E peek();
}
