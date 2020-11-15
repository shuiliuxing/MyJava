package org.bing.learn.数据结构.队列;

import java.util.Random;

public class Test {
    public static void main(String[] args){
        ArrayQueue<Integer> queue=new ArrayQueue<Integer>();
        for(int i=0;i<10;i++){
           queue.push(i);
        }
        while (!queue.isEmpty()){
            System.out.println(queue.pop());
        }

    }
}
