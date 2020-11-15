package org.bing.learn.挑战程序设计.动态规划法.硬币问题;

public class Solution {
    public static void main(String[] args){
        int[] arr={1,2,7,8,12,50};
        int sum=15;
        //System.out.println(getLessNumberOfCoin(arr,sum));
    }

//    public static int getLessNumberOfCoin(int[] arr, int sum){
//        int n=arr.length;
//        int[][] dp=new int[n+1][sum+1];
//        for(int j=1;j<=sum;j++){
//            dp[0][j]=j;
//        }
//        for(int i=1;i<n;i++){
//            for(int j=0;j<=sum;j++){
//                if()
//                 dp[i][j]+=Math.min(dp[i-1][j],dp[i-1][j-arr[i]]+1);
//            }
//        }
//        for(int i=0;i<n;i++){
//            System.out.println("第"+i+"\t"+dp[i][n]+"\t");
//        }
//        return dp[n-1][sum];
//    }
}
