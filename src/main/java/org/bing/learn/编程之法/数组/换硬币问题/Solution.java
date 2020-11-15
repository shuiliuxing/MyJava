package org.bing.learn.编程之法.数组.换硬币问题;

import org.bing.work.基本工具.Tools;

public class Solution {
    public static void main(String[] args) {
        int[] arr={0,1,2,5,10};
        System.out.println(changeCoin(arr,100));

        int[] arr1={1,2,5,10};
        System.out.println(changeCoin2(100,arr1));

    }

    /*
        思路：
               1.用前m个硬币去凑n元=能用前m-1个凑n元+用前m个凑n元（使用第m个，即m-1个凑n-arr[i]）
     */
    public static int changeCoin(int[] arr, int n) {
        int m=arr.length-1;
        int[][] dp=new int[m+1][n+1];
        dp[0][0]=1;
        for(int i=1;i<=m;i++){
            for(int j=0;j<=n;j++){
                //里面已经包括dp[i-1][j]的情况（即k=0时）
                for (int k=0;k<=j/arr[i];k++){
                    dp[i][j] += dp[i - 1][j - k * arr[i]];
                }
            }
        }
        return dp[m][n];
    }

    public static int changeCoin2(int amount, int[] coins) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        dp[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= amount; j++) {
                for (int k = 0; k * coins[i - 1] <= j; k++) {
                    dp[i][j] += dp[i - 1][j - k * coins[i - 1]];
                }
            }
        }
        return dp[n][amount];
    }


}
