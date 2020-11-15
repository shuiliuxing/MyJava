package org.bing.learn.算法.动态规划.背包问题.背包01;

public class Solution {
    public static void main(String[] args){
        int weight[] = {0,2,3,4,5,9};
        int value[] = {0,3,4,5,8,10};
        int N=6;
        int W=21;
        System.out.println(dp(weight,value,N,W));
    }



    public static void dp1(){
        int weight[] = {0,2,3,4,5,9};
        int value[] = {0,3,4,5,8,10};

        int[][] B=new int[6][21];       //5个物品(0~5)，可容纳重量20(0~20)
        for(int k=1;k<6;k++){
            for(int c=1;c<21;c++){
                if(weight[k]>c){
                    B[k][c]=B[k-1][c];
                }else{
                    int v1=B[k-1][c-weight[k]]+value[k];
                    int v2=B[k-1][c];
                    B[k][c]=Math.max(v1,v2);
                }
            }
        }
        System.out.println(B[5][20]);
    }

    public static int dp(int[] weight,int[] value,int N,int W){
        int[][] B=new int[N][W];
        for(int i=1;i<N;i++)
        {
            for(int c=1;c<W;c++)
            {
                //当第i个放不了剩余空间时
                if(weight[i]>c){
                    B[i][c]=B[i-1][c];
                }else{
                    int v1=B[i-1][c-weight[i]]+value[i]; //选择放第i个
                    int v2=B[i-1][c];           //选择不放第i个
                    B[i][c]=Math.max(v1,v2);    //取两者最大值
                }
            }
        }
        return B[N-1][W-1];
    }



}
