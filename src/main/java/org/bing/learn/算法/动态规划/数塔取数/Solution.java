package org.bing.learn.算法.动态规划.数塔取数;

/*
数塔取数问题
一个高度为N的由正整数组成的三角形，从上走到下，求经过的数字和的最大值。
每次只能走到下一层相邻的数上，例如从第3层的6向下走，只能走到第4层的2或9上。
    该三角形第n层有n个数字，例如：
    第1层有一个数字： 5
    第2层有两个数字： 8   4
    第3层有三个数字： 3   6   9
    第4层有四个数字： 7   2   9   5
最优方案是：5 + 8 + 6 + 9 = 28
 */
public class Solution {
    public static void main(String[] args){
        int[][] arr={{5},{8,4},{3,6,9},{7,2,9,5}};
        System.out.println(tower2(arr,4));
    }

    public static int tower1(int[][] arr, int n){
        int kmax=0;
        int max=0;
        int[][] result=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(i!=0 && j!=0){
                    kmax=arr[i-i][j-1];
                    if(j<i && kmax<arr[i-1][j]){
                        kmax=arr[i-1][j];
                    }
                }else if(j<i && i!=0){
                    kmax=arr[i-1][j];
                }
                arr[i][j]=kmax+arr[i][j];
                max=Math.max(arr[i][j], max);
            }
        }
        return max;
    }

    //我的
    public static int tower2(int[][] arr,int n){
        int max=0;
        int[][] reArr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++)
            {
                //第1个
                if(i==0 && j==0){
                    reArr[i][j]=arr[i][j];
                }
                //左边缘
                else if(j==0){
                    reArr[i][j]=reArr[i-1][j]+arr[i][j];
                }
                //斜坡
                else if(i==j){
                    reArr[i][j]=reArr[i-1][j-1]+arr[i][j];
                }else{
                    reArr[i][j]=Math.max(reArr[i-1][j-1]+arr[i][j],reArr[i-1][j]+arr[i][j]);
                }
                max=Math.max(max,reArr[i][j]);
            }
        }
        return max;
    }


}
