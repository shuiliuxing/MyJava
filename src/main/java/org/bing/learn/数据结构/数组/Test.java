package org.bing.learn.数据结构.数组;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args){
        Array<Integer> arr=new Array<>(20);
        for(int i=0;i<10;i++){
            arr.add(i);
        }
        arr.add(10,11);
        arr.remove(10);
        for(int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
    }
}
