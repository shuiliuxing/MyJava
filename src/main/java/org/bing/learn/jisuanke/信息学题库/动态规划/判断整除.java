package org.bing.learn.jisuanke.信息学题库.动态规划;

import org.bing.work.基本工具.Tools;

import java.util.Scanner;

public class 判断整除 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int K=scanner.nextInt();
        int[] arr=new int[N+1];
        for(int i=1;i<=N;i++){
            arr[i]=scanner.nextInt();
        }
        //i,j 即 i个数取余K的余数
        //每个i得到的余数可能有正负两个值，用bool型 ;f[i][j]表示用前i个数计算能得到余数j
        boolean[][] dp=new boolean[N+1][K+1];
        //如果只有1个数，那么余数可以确定
        dp[1][arr[1] % K] = true;
        for(int i=2;i<=N;i++){
            //余数 0~k-1
            for (int j=0;j<=K-1;j++){
                //有没有+k)%k这部分，对结果没有影响，但会避免下标出现负数，使其变为正数
                //前i个数余数为j的情况= 前i-1个余数为j（）的情况 + 前i个余数为j(相当于前i-1)
                dp[i][j]= dp[i-1][(j+arr[i]%K)%K] || dp[i-1][(j-arr[i]%K+K)%K];
            }
        }
        if(dp[N][0]) {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
