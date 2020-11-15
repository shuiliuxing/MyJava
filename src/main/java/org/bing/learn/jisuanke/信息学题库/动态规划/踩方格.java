package org.bing.learn.jisuanke.信息学题库.动态规划;

import java.util.Scanner;

//未理解（状态方程）
public class 踩方格 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] dp=new int[21];
        dp[0]=1;
        dp[1]=3;    //东西北
        dp[2]=7;
        for(int i=3;i<=n;i++){
            dp[i]=2*dp[i-1]+dp[n-2];
        }
        System.out.println(dp[n]);
    }
}
