package org.bing.learn.nowcode.动态规划.最长公共子串NC127;

public class Solution {
    public static void main(String[] args){
        String str1="1AB2345CD";
        String str2="12345EF";
        System.out.println(LCS(str1,str2));

    }

    //未解决
    public static int LCS (String str1, String str2) {
        int m=str1.length();
        int n=str2.length();
        int[][] dp=new int[m+1][n+1];

        for(int i=1;i<=m;i++)
        {
            char a=str1.charAt(i-1);
            for(int j=1;j<=n;j++)
            {
                char b=str2.charAt(j-1);
                if(a==b){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[m][n];
    }
}
