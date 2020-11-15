package org.bing.learn.数据结构.栈;

import org.bing.learn.数据结构.数组.Array;

public class ArrayStack<E> implements Stack<E> {
    private Array<E> arr;

    public ArrayStack(int capacity){
        arr=new Array<>(capacity);
    }
    public ArrayStack(){
        this(10);
    }

    @Override
    public int getSize(){
        return arr.size();
    }

    @Override
    public boolean isEmpty(){
        return arr.isEmpty();
    }

    /** 添加元素 **/
    @Override
    public void push(E e){
        arr.add(arr.size(),e);
    }

    /** 删除元素 **/
    @Override
    public E pop(){
        return arr.remove(arr.size()-1);
    }

    /** 栈顶元素 **/
    @Override
    public E peek(){
        return arr.get(arr.size()-1);
    }
}
