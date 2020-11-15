package org.bing.learn.算法.递归.汉诺塔;

public class Solution {
    static int times;   //一共走了多少步
    public static void main(String[] args){
        char A='A';
        char B='B';
        char C='C';
        int n=10;   //设置10个盘子
        hannoi(n,A,B,C);
    }

    public static void hannoi(int n,char A,char B,char C) {
        if (n == 1) {
            move(n, A, C);
        } else {
            hannoi(n - 1, A, C, B);  //先把A中的n-1个盘子移动到B
            move(n, A, C);              //把A中第n个（最后一个）移动到C
            hannoi(n - 1, B, A, C);  //把B中的n-1个盘子移动到C
        }
    }

    public static void move(int disk, char M, char N){
        System.out.println("第"+ (++times) +"次移动，盘子 "+disk+"   "+M+"----------> "+N);
    }


}
