package org.bing.learn.数据结构.集合;

import org.bing.learn.数据结构.链表.LinkedList;

public class LinkedListSet<E> implements Set<E> {
    private LinkedList linkedList;

    @Override
    public boolean isEmpty(){
        return linkedList.isEmpty();
    }

    @Override
    public int getSize(){
        return linkedList.getSize();
    }

    @Override
    public void add(E e){
        if(!linkedList.contains(e)){
            linkedList.add(0,e);
        }
    }

    @Override
    public void remove(E e){
        linkedList.removeEle(e);
    }

    @Override
    public boolean contains(E e){
        return linkedList.contains(e);
    }
}
