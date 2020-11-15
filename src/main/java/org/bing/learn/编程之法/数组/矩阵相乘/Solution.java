package org.bing.learn.编程之法.数组.矩阵相乘;

import org.bing.work.基本工具.Tools;

public class Solution {
    public static void main(String[] args) {
        int[][] arr = {
                {0,1},
                {0,0}
        };
        int[][] brr = {
                {1,2},
                {3,4}
        };
        int n=2;
        Tools.printArr(mulMatrix(arr,brr,n));
    }

    public static int[][] mulMatrix(int[][] arr, int[][] brr, int n) {
        int[][] res=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    res[i][j]+=arr[i][k]*brr[k][j];
                }
            }
        }
        return res;
    }
}
