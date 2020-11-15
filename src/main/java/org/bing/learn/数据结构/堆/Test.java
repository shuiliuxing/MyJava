package org.bing.learn.数据结构.堆;

public class Test {
    public static void main(String[] args){
        Integer[] arr={4,5,1,6,2,7,3,8};
        MaxHeap<Integer> heap=new MaxHeap<Integer>(arr);
        System.out.println("最大值："+heap.getTop());
    }
}
