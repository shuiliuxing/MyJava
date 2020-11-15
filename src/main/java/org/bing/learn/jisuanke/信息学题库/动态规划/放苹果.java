package org.bing.learn.jisuanke.信息学题库.动态规划;

import java.util.Scanner;

public class 放苹果 {

    //非递归
    public static void solve(){
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        for(int k=0;k<t;k++){
            int M=scanner.nextInt();
            int N=scanner.nextInt();
            int[][] dp=new int[M+1][N+1];
            //0个苹果、1个苹果
            for(int j=0;j<=N;j++){
                dp[0][j]=dp[1][j]=1;
            }
            //0个盘子、1个盘子
            for(int i=0;i<=M;i++){
                dp[i][0]=dp[i][1]=1;
            }
            for(int m=2;m<=M;m++){
                for(int n=2;n<=N;n++){
                    //苹果比盘子少
                    if(m<n){
                        dp[m][n]=dp[m][m];
                    }else {
                        //m个苹果放n个盘子=m个苹果放n-1个盘子+(m-n)个苹果放n个盘子
                        //             =第n个盘子不放+相当于n个盘子发
                        dp[m][n] = dp[m][n-1]+dp[m-n][n];
                    }
                }
            }
            System.out.println(dp[M][N]);
        }
    }

    public static int solve1(int m,int n){
        if(m==0 || n==1){
            return 1;
        }
        if(m<n){
            return solve1(m,m);
        }else {
            return solve1(m, n-1) + solve1(m - n, n);
        }
    }
}

/*
小蒜想知道把 MM 个同样的苹果放在 NN 个同样的盘子里，允许有的盘子空着不放，共有多少种不同的分法？（用 KK 表示）55，11，11 和 11，55，11 是同一种分法。

输入格式
第一行是测试数据的数目 t(0 \le t \le 20)t(0≤t≤20)。

以下每行均包含两个整数 MM 和 NN，以空格分开。1 \le M, N \le 101≤M,N≤10。

输出格式
对输入的每组数据 MM 和 NN，用一行输出相应的 KK。

输出时每行末尾的多余空格，不影响答案正确性

样例输入复制
1
7 3
样例输出复制
8
 */
