package org.bing.learn.编程之法.数组.最大连续子数组和;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,-2,3,10,-4,7,2,-5};
        System.out.println(sumOfNum(arr));

    }

    //利用全排列，再取前k个数
    public static int sumOfNum(int[] arr) {
        int n=arr.length;
        int[] dp=new int[n];
        //初始化
        dp[0]=arr[0];
        int max=dp[0];
        //动态规划
        for(int i=1;i<n;i++){
            if(dp[i-1]+arr[i]>arr[i]){
                dp[i]=dp[i-1]+arr[i];
            }else{
                dp[i]=arr[i];
            }
            if(max<dp[i]){
                max=dp[i];
            }
        }
        return max;
    }
}
