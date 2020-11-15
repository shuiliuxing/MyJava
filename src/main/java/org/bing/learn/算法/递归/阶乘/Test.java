package org.bing.learn.算法.递归.阶乘;

public class Test {
    public static void main(String[] args){
        int r=0;
        int N=10000;
        while (N>0){
            r+=N/5;
            N/=5;
        }
        System.out.println(r);
    }
}
