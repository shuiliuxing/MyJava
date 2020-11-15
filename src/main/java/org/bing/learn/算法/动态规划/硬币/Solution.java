package org.bing.learn.算法.动态规划.硬币;

public class Solution {
    public static void main(String[] args){
        System.out.println(dp(10));
    }

    //动态规划
    public static int dp(int n){
        int[] coin={1,2,5,10};
        int[][] B=new int[5][n+1];
        //多种面值组成0，只有1种，即不选
        for(int i=0;i<=4;i++){
            B[i][0]=1;
        }
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=n;j++)
            {
                //当第i-1枚硬币比组成的价值大时，不选
                if(coin[i-1]>j){
                    B[i][j]=B[i-1][j]%1000000007;
                }else {
                    //用前i-1枚硬币组成j 再加上 用前i枚组成j（即选择第i枚）
                    B[i][j] = (B[i - 1][j] + B[i][j - coin[i - 1]])%1000000007;
                }
            }
        }
        return B[4][n];
    }


    //优化-一维数组
    public static int dp2(int n){
        int[] coin={1,2,5,10};
        int[] B=new int[n+1];
        B[0]=1;
        for(int coi:coin)
        {
            for(int j=1;j<=n;j++)
            {
                if(coi<=j) {
                    B[j] = B[j] + B[j - coi];
                }
            }
        }
        return B[n];
    }
}
