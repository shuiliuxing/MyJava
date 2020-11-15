package org.bing.learn.nowcode.动态规划.子数组的最大累加和问题NC19;

public class Solution {
    public static void main(String[] args){
        int[] arr={1, -2, 3, 5, -2, 6, -1};
        System.out.println(maxsumofSubarray(arr));
    }

    public static int maxsumofSubarray (int[] arr) {
        int n=arr.length;
        int[] dp=new int[n];
        dp[0]=arr[0];
        int max=dp[0];
        for(int i=1;i<n;i++){
            dp[i]=Math.max(arr[i]+dp[i-1],arr[i]);
            max=Math.max(dp[i],max);
        }
        return max;
    }
}
