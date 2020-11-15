package org.bing.learn.jisuanke.信息学题库.动态规划;

import java.util.Arrays;
import java.util.Scanner;

public class Pell数列 {
    static int[] flag=new int[32767];

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++) {
            int k=scanner.nextInt();
            Arrays.fill(flag,-1);
            System.out.println(pell(k)%32767);
        }
    }

    public static int pell(int k){
        if(k==1){
            return 1;
        }
        if(k==2){
            return 2;
        }
        if(flag[k]!=-1){
            return flag[k];
        }
        int value=2*pell(k-1)%32767+pell(k-2)%32767;
        flag[k]=value;
        return value;
    }

}

/*

Pell 数列 a1, a2, a3,... 的定义是这样的，a1 = 1, a2 = 2, ... , an = 2 * a{n - 1} + a{n - 2} (n > 2)

小蒜给出一个正整数 kk，要求 \text{Pell}Pell 数列的第 kk 项模上 3276732767 是多少。

输入格式
第 11 行是测试数据的组数 n(1 \le n \le 20)n(1≤n≤20)，后面跟着 nn 行输入。每组测试数据占 11 行，包括一个正整数 k (1 \le k < 1000000)k(1≤k<1000000)。

输出格式
nn 行，每行输出对应一个输入。输出应是一个非负整数。

输出时每行末尾的多余空格，不影响答案正确性

样例输入复制
2
1
8
样例输出复制
1
408

*/
