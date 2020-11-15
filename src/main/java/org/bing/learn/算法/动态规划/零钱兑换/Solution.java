package org.bing.learn.算法.动态规划.零钱兑换;

public class Solution {
    public static void main(String[] nargs){
        int[] coins={2};
        System.out.println(coinChange(coins,3));
    }

    public static int coinChange(int[] coins, int amount){
        int[][] B=new int[coins.length+1][amount+1];
        for(int j=1;j<=amount;j++){
            B[0][j]=2147483640;
        }
        for(int i=0;i<=coins.length;i++){
            B[i][0]=0;
        }
        for(int i=1;i<=coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(coins[i-1]>j){
                    B[i][j]=B[i-1][j];
                }else {
                    B[i][j] = Math.min(B[i - 1][j], B[i][j - coins[i-1]] + 1);
                }
            }
        }
        if(B[coins.length][amount]>=2147483640) {
            return -1;
        }
        return B[coins.length][amount];
    }
}


/*

    参考：https://www.bilibili.com/video/BV1Ev411q7MC?from=search&seid=16141789012171479807
 */