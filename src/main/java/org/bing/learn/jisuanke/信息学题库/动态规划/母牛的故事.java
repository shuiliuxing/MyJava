package org.bing.learn.jisuanke.信息学题库.动态规划;

import java.util.Scanner;

public class 母牛的故事 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n;
        while ((n=scanner.nextInt())!=0){
            int[] dp=new int[55];
            dp[1]=1;
            dp[2]=2;
            dp[3]=3;
            for (int i=4;i<=n;i++){
                dp[i]=dp[i-1]+dp[i-3];
            }
            System.out.println(dp[n]);
        }
    }

    //递归
    public static int dp(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else if(n==3){
            return 3;
        }
        else {
            return dp(n-1)+dp(n-3);
        }
    }

}
