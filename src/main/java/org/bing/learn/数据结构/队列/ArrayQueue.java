package org.bing.learn.数据结构.队列;

import org.bing.learn.数据结构.数组.Array;

public class ArrayQueue<E> implements Queue<E> {
    private Array<E> arr;

    public ArrayQueue(int capacity){
        arr=new Array<>(capacity);
    }

    public ArrayQueue(){
        arr=new Array<>();
    }

    @Override
    public int getSize(){
        return arr.size();
    }

    @Override
    public boolean isEmpty(){
        return arr.isEmpty();
    }

    /** 入队 **/
    @Override
    public void push(E e){
        arr.add(arr.size(),e);
    }

    /** 出队 **/
    @Override
    public E pop(){
        return arr.remove(0);
    }

    /** 队头元素 **/
    @Override
    public E getFront(){
        return arr.get(0);
    }
}
