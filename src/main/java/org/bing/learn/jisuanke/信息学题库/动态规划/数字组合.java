package org.bing.learn.jisuanke.信息学题库.动态规划;

import java.util.Scanner;

public class 数字组合 {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n =scanner.nextInt();   //n个数
        int t=scanner.nextInt();    //和为t
        int[] s=new int[n+1];
        for(int i=1;i<=n;i++){
            s[i]=scanner.nextInt();
        }

        int[][] dp=new int[n+1][t+1];
        //i个数和为0，对于每个i只有1种，即不加
        for(int i=0;i<=n;i++){
            dp[i][0]=1 ;
        }
        for(int i=1;i<=n;i++){
            for (int j=1;j<=t;j++){
                //若第i个数比j大，相当于用i-1个数凑成j
                if(s[i]>j){
                    dp[i][j]=dp[i-1][j];
                }else{
                    //用i个数凑成j=用i-1个数凑成j(即第j个不加) + 用i-1个数凑成j-s[i](加上第j个时)
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-s[i]];
                }
            }
        }
        System.out.println(dp[n][t]);
    }
}
