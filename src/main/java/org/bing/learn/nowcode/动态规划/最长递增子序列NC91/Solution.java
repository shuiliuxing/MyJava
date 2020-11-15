package org.bing.learn.nowcode.动态规划.最长递增子序列NC91;

import org.bing.work.基本工具.Tools;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,8,6,4};
        Tools.print(LIS(arr));
    }

    public static int[] LIS(int[] arr) {
        int n=arr.length;
        //end[]保存最大子序列
        int[] end=new int[n];
        end[0]=arr[0];
        int len=1;
        //保存到i位置的最大子序列个数
        int[] dp=new int[n];
        dp[0]=1;
        for(int i=1;i<n;i++){
            //i比res前1个大时
            if(arr[i]>=end[len-1]){
                end[len]=arr[i];
                dp[i]=len+1;
                len++;
            }
            //i比res前1个小时
            else{
                //找到大于i的最近一个数
                for(int j=0;j<len;j++){
                    if(end[j]>arr[i]){
                        dp[i]= j+1;
                        end[j]=arr[i];
                        break;
                    }
                }
            }
        }

        int[] res=new int[len];
        for(int i=n-1;i>=0;i--){
            if(dp[i]==len){
                len--;
                res[len]=arr[i];
            }
        }
        return res;
    }
}
