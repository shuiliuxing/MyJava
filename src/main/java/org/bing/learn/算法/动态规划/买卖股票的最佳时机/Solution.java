package org.bing.learn.算法.动态规划.买卖股票的最佳时机;

public class Solution {
    public static void main(String[] args){
        int[] arr={7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices){
        int[] B=new int[prices.length];
        int max=0;
        for(int i=0;i<prices.length;i++)
        {
            for(int j=0;j<i;j++){
                if(prices[i]>prices[j]) {
                    B[i] = Math.max(B[i], prices[i]-prices[j]);
                    max=Math.max(max,B[i]);
                }
            }
        }
        return max;
    }


}
