package org.bing.learn.jisuanke.信息学题库.动态规划;

import org.bing.work.基本工具.Tools;

import java.util.Scanner;

public class 上学路线 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int n=scanner.nextInt();

        //路障坐标
        boolean[][] flag=new boolean[a+1][b+1];
        for(int i=0;i<n;i++){
            int x=scanner.nextInt();
            int y=scanner.nextInt();
            flag[x][y]=true;
        }

        int[][] dp=new int[a+1][b+1];
        dp[1][1]=1;
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=b;j++)
            {
                if((i!=1 || j!=1) && !flag[i][j]){
                    dp[i][j]=dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        System.out.println(dp[a][b]);
    }
}
