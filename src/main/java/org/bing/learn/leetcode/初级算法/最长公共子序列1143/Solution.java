package org.bing.learn.leetcode.初级算法.最长公共子序列1143;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int[][] dp=new int[m+1][n+1];

        for(int i=1;i<=m;i++)
        {
            char a=text1.charAt(i-1);
            for(int j=1;j<=n;j++)
            {
                char b=text2.charAt(j-1);
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
