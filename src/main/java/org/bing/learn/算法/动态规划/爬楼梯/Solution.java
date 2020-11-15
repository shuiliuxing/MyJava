package org.bing.learn.算法.动态规划.爬楼梯;

import com.fasterxml.jackson.core.PrettyPrinter;

public class Solution {
    public static void main(String[] args){
        System.out.println(dp(3));
    }

    //递归
    public static int elevator(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int r=elevator(n-1)+elevator(n-2);
            return r;
        }
    }

    //动态规划
    public static int dp(int n){
        int[] B=new int[n+1];
        for(int i=1;i<=n;i++)
        {
            if(i==1 || i==2){
                B[i]=i;
            }
            if(i>=3){
                B[i]=B[i-1]+B[i-2];
            }
        }
        return B[n];
    }
}
