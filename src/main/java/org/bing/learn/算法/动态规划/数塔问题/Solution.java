package org.bing.learn.算法.动态规划.数塔问题;

/*
    从数塔顶层出发，每个结点可以选择向左走或向右走，要求一直走到塔底，使得走过的路径上的数值和最大
    如上图所示的数塔，最大路径和为86，经过的路径从塔顶到塔底为13，8，26，15，24。
 */
public class Solution {
    public static void main(String[] args){
        int[][] arr={
                {0,0,0,0,13,0,0,0,0},
                {0,0,0,11,0,8,0,0,0},
                {0,0,12,0,7,0,26,0,0},
                {0,6,0,14,0,15,0,8,0},
                {12,0,7,0,13,0,24,0,11}
        };
        System.out.println(tower1(arr,5,9));
    }

    //我的
    public static int tower1(int[][] arr,int m, int n){
        int max=0;
        int[][] reArr=new int[n][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                //有效
                if(arr[i][j]!=0)
                {
                    //顶层
                    if(i==0){
                        reArr[i][j]=arr[i][j];
                    }
                    //左边缘
                    else if(j==0){
                        reArr[i][j]=reArr[i-1][j+1]+arr[i][j];
                    }
                    //右边缘
                    else if(j==(n-1)){
                        reArr[i][j]=reArr[i-1][j-1]+arr[i][j];
                    }
                    //其它位置
                    else{
                        //左右都有数
                        if(arr[i-1][j-1]!=0 && arr[i-1][j+1]!=0){
                            reArr[i][j]=Math.max(reArr[i-1][j-1],reArr[i-1][j+1])+arr[i][j];
                        }
                        //左边有数
                        else if(arr[i-1][j-1]!=0){
                            reArr[i][j]=reArr[i-1][j-1]+arr[i][j];
                        }
                        //右边有数
                        else if(arr[i-1][j+1]!=0){
                            reArr[i][j]=reArr[i-1][j+1]+arr[i][j];
                        }
                    }
                    max=Math.max(max,reArr[i][j]);
                }
            }
        }
        return max;
    }
}
