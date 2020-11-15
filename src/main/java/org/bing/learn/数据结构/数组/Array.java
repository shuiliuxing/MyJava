package org.bing.learn.数据结构.数组;

/*
    线性表
 */
public class Array<E> {
    private E[] data;   //数组
    private int size;   //元素个数

    //构造函数
    public Array(int capacity){
        data=(E[])new Object[capacity];
        size=0;
    }
    public Array(){
        data=(E[])new Object[10];   //默认容量10
        size=0;
    }

    //是否为空
    public boolean isEmpty(){
        return size==0;
    }

    //返回元素个数
    public int size(){
        return size;
    }

    //扩容
    public void resize( int newCapacity){
        E[] newData=(E[]) new Object[newCapacity];
        for(int i=0;i<size;i++){
            newData[i]=data[i];
        }
        data=newData;
    }

    //查找--指定位置
    public E get(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException();
        }
        return data[index];
    }

    //替换元素
    public void set(int index, E e){
        if(index<0 || index>=size){
            throw new IllegalArgumentException("Index越界！");
        }
        data[index]=e;
    }

    //添加--向指定位置
    public void add(int index, E e){
        if(index<0 || index>size){
            throw new IllegalArgumentException("添加失败！index非法！");
        }
        //需要扩容,2倍
        if(size==data.length){
            resize(2*data.length);
        }
        for(int i=size;i>index;i++){
            data[i]=data[i-1];
        }
        data[index]=e;
        size++;
    }
    //添加--尾部添加
    public void add(E e){
        add(size,e);
    }

    //删除--指定位置
    public E remove(int index){
        if(index<0 || index>=size){
            throw new IllegalArgumentException();
        }
        E ret=data[index];  //保存被删除的元素
        for(int i=index;i<size-1;i++){
            data[i]=data[i+1];
        }
        size--;
        data[size]=null;    //帮助GC
        //容量过大，缩减一半
        if(size==data.length/4 && data.length/2!=0){
            resize(data.length/2);
        }
        return ret;
    }

    //交换元素
    public void swap(int i,int j){
        if(i<0 || i>=size || j<0 || j>=size){
            throw new IllegalArgumentException("数组越界！");
        }
        E tmp=data[i];
        data[i]=data[j];
        data[j]=tmp;
    }

}
