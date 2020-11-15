package org.bing.learn.nowcode.递归.找到字符串的最长无重复字符子串NC41;

import org.bing.work.基本工具.Tools;

public class Solution {
    public static void main(String[] args){
        int[] arr={2,2,3,4,3};
        System.out.println(maxLength1(arr));
    }

    public static int maxLength(int[] arr) {
        int n=arr.length;
        boolean[] flag=new boolean[n];
        int[] dp=new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            int len=1;
            int j;
            for(j=i-1;j>=0;j--){
                if(arr[j]==arr[i]){
                    flag[j]=true;
                    break;
                }
                if(flag[j]){
                    break;
                }
                len++;

            }
            //arr[i]在之前没出现
            if(j<0){
                dp[i]=dp[i-1]+1;
            }else{
                dp[i]=len;
            }
        }
        int max=dp[0];
        for(int i=1;i<n;i++){
            if(max<dp[i]){
                max=dp[i];
            }
        }
        return max;
    }

    //未理解
    public static int maxLength1(int[] arr) {
        int[] dp=new int[100005];
        int len=arr.length;
        int s=0;
        int t=0;
        for(int i=0;i<len;i++){
            int tmp=arr[i];
            s=Math.max(s, dp[tmp]);
            t=Math.max(t, i-s+1);
            dp[tmp]=i+1;
        }
        return t;
    }
}
