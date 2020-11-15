package org.bing.learn.数据结构.队列;

import org.bing.learn.数据结构.数组.Array;

/**
 * 循环队列
 * 0 1 2 3 4 5 6 7 8 9 空    其中front=0、tail=10、size=11
 * @param <E>
 */
public class LoopQueue<E> implements Queue<E> {
    private E[] data;
    private int size;
    private int front,tail;

    public LoopQueue(int capacity){
        data=(E[])new Object[capacity];
        size=0;
        front=0;
        tail=0;
    }

    public LoopQueue(){
       this(10);
    }

    /** 元素个数 **/
    @Override
    public int getSize(){
        return size;
    }

    /** 是否队空 **/
    @Override
    public boolean isEmpty(){
        return front==tail;
    }

    /** 扩容 **/
    public void resize(int newCapacity){
        E[] newData=(E[])new Object[newCapacity+1];
        for (int i=0;i<size;i++){
            newData[i]=data[(i+front)%data.length]; // 可能由于出队后，front偏移了
        }
        data=newData;
        front=0;    //front队首又回到0号索引
        tail=size;  //预留空
    }

    /** 入队 **/
    @Override
    public void push(E e){
        //判断队列是否满了
        if((tail+1)%data.length==front){
            resize(data.length-1);
        }
        data[tail]=e;
        tail=(tail+1)%data.length;
        size++;
    }

    /** 出队 **/
    @Override
    public E pop(){
        if(isEmpty()){
            throw new IllegalArgumentException();
        }
        E ret=data[front];
        data[front]=null;
        front=(front+1)%data.length;    //队头指向下一个
        size--;

        //缩容
        if(size==(data.length-1)/4 && (data.length-1)/2!=0){
            resize((data.length-1)/2);
        }
        return ret;
    }

    /** 队头元素 **/
    @Override
    public E getFront(){
        if(isEmpty()){
            throw new IllegalArgumentException("队列为空！");
        }
        return data[front];
    }
}
