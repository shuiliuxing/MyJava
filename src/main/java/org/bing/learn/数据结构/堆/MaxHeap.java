package org.bing.learn.数据结构.堆;

import org.bing.learn.数据结构.数组.Array;
/*
    最大堆
    数组实现
 */
public class MaxHeap<E extends Comparable<E>> {
    private Array<E> data;

    //构造函数
    public MaxHeap(){
        data=new Array<>();
    }
    public MaxHeap(int capacity){
        data=new Array<>(capacity);
    }
    public MaxHeap(E[] arr){
        data=new Array<>(arr.length);
        for (int i=0;i<arr.length;i++){
            data.add(i,arr[i]);
        }
        //从最后一个父节点开始siftDown操作
        for(int i=parent(data.size()-1); i>=0; i--){
            siftDown(i);
        }
    }

    //元素个数
    public int getSize(){
        return data.size();
    }
    //是否为空
    public boolean isEmpty(){
        return data.isEmpty();
    }

    //获取父节点
    public int parent(int index){
        if(index==0){
            throw new IllegalArgumentException("Index没有父节点");
        }
        return (index-1)/2;
    }
    //获取左节点
    public int lChild(int index){
        return index*2+1;
    }

    //向下调整
    public void siftDown(int k){
        while (lChild(k) < data.size()){
            int j=lChild(k);
            //右节点比左节点大（比较左右节点）
            if(j+1<data.size() && data.get(j+1).compareTo(data.get(j))>0){
                j++;
            }
            //父节点比左节点大，不用调整（比较父子节点）
            if (data.get(k).compareTo(data.get(j))>=0){
                break;
            }
            //交换
            data.swap(k,j);
            //调整后则继续向下调整
            k=j;
        }
    }

    //向上调整
    public void siftUp(int k){
        //比较子节点与父节点 (如有调整继续向上调整)
        while (k>0 && data.get(parent(k)).compareTo(data.get(k))<0){
            data.swap(parent(k),k);
            k=parent(k);
        }
    }

    //添加
    public void add(E e){
        data.add(e);    //添加为数组最后1个元素
        siftDown(data.size()-1);
    }

    //查找--最大元素
    public E getTop(){
        if(data.size()==0){
            throw new IllegalArgumentException("堆为空，无最大！");
        }
        return data.get(0);
    }

    //堆顶元素替换（向下调整）
    public E replaceTop(E e){
        E value=getTop();
        data.set(0,e);  //替换堆顶
        siftDown(0);
        return value;
    }

    //删除--堆顶
    public E removeTop(){
        E value=getTop();
        //将最后1个元素与堆顶替换
        data.swap(data.size()-1,0);
        //移除最后1个元素
        data.remove(data.size()-1);
        //向下调整
        siftDown(0);
        return value;
    }

}
