package org.bing.learn.算法.动态规划.使用最小花费爬楼梯;

import java.util.Arrays;
/*
    转移方程：
    dp[k][i] = max{dp[k-1][j] + mean(j...i) for each j < i}

    我们可以把数组 A 分成两部分来考虑：
    1. 前 T 个元素分成 K-1 个小组
    2. 剩余的元素分成 1 组，然后计算平均值之和的最大值

*/
class Solution {
    public static void main(String[] args){
        int[] A={9,1,2,3,9};
        int K=3;
        System.out.println(largestSumOfAverages(A,K));
    }

    public static double largestSumOfAverages(int[] A, int K) {
        int n = A.length;
        double[][] dp = new double[K][n];
        double sum = 0;

        //分成0组时，平均值
        for (int i = 0; i < n; i++) {
            sum += A[i];
            dp[0][i] = sum / (i+1);
        }

        //从分成1组开始
        for (int k=1; k<K; k++)
        {
            //遍历数组，分成1组至少有1个数
            for (int i=k; i<n; i++)
            {
                //计算k到i的总和，取平均数
                sum = 0.0;
                for (int j=i; j>k-1; j--)
                {
                    sum+=A[j];
                    dp[k][i]=Math.max(dp[k][i], dp[k-1][j-1] + sum/(i-j+1) );
                }
            }
        }
        return dp[K-1][n-1];
    }


    public static void solution(int[] arr,int K){
        int n=arr.length;
        double[][] dp=new double[K+1][n+1];
        double sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            dp[0][i]=sum/(i+1);
        }
    }
}