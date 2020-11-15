package org.bing.learn.数据结构.队列;

import org.bing.learn.数据结构.堆.MaxHeap;
/*
    优先队列
    最大堆实现
 */
public class PriorityQueue<E extends Comparable<E>> implements Queue<E> {

    private MaxHeap<E> maxHeap;

    public PriorityQueue(){
        maxHeap=new MaxHeap<E>();
    }

    @Override
    public int getSize(){
        return maxHeap.getSize();
    }

    @Override
    public boolean isEmpty(){
        return maxHeap.isEmpty();
    }

    @Override
    public void push(E e){
        maxHeap.add(e);
    }

    /** 出队 **/
    @Override
    public E pop(){
        return maxHeap.removeTop();
    }

    /** 队头元素 **/
    @Override
    public E getFront(){
        return maxHeap.getTop();
    }
}
