package org.bing.learn.jisuanke.信息学题库.动态规划;

import java.util.Scanner;

public class 买书 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] s={0,10,20,50,100};
        int[][] dp=new int[5][n+1];
        //无论书的价格为多少0、10、20、50、100，只要0元=没钱，只有1种方案
        for(int i=0;i<=4;i++){
            dp[i][0]=1;
        }
        //遍历每一种价格10、20、50、100
        for(int i=1;i<=4;i++)
        {
            //钱数为1~n的区间
            for(int j=1;j<=n;j++)
            {
                //看能凑出多少本书
                for(int k=0;k<=j/s[i];k++){
                    //i本书凑j元=i-1本书再去凑
                    //dp[i][j]=dp[i-1][j-0*s[i]]+dp[i-1][j-1*s[i]]+dp[i-1][j-2*s[i]]+......+dp[i-1][j-k*s[i]]
                    dp[i][j]+=dp[i-1][j-k*s[i]];
                }
            }
        }
        System.out.println(dp[4][n]);
    }
}
