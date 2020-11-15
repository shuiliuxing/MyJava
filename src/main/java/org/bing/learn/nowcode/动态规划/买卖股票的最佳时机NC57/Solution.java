package org.bing.learn.nowcode.动态规划.买卖股票的最佳时机NC57;

public class Solution {
    public static void main(String[] args){
        int[] prices={};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int n=prices.length;
        if(n==0){
            return 0;
        }
        int[] dp=new int[n];
        for(int i=0;i<prices.length;i++){
            for(int j=0;j<i;j++){
                if(prices[i]-prices[j]>dp[i]){
                    dp[i]=prices[i]-prices[j];
                }
            }
        }
        int max=dp[0];
        for(int i=1;i<dp.length;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }
        return max;
    }

    //更简单
    public static int maxProfit1(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return 0;
        }
        int min=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            min=Math.min(min,prices[i]);
            profit=Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}
