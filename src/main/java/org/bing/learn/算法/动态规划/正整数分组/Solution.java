package org.bing.learn.算法.动态规划.正整数分组;

public class Solution {
    public static void main(String[] args){
        int[] nums={1,2,3,4,20};
        System.out.println(dp(nums));
    }


    //有误
    public static int dp(int[] nums){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        int half=sum/2;
        int[] B=new int[half+1];
        for(int i=1;i<=nums.length;i++){
            for(int j=0;j<=half;j++){
                if(nums[i-1]<=j){
                    B[j]=Math.max(B[j],B[j-nums[i-1]]+nums[i-1]);
                }
            }
        }
        for(int i=0;i<B.length;i++){
            System.out.println(B[i]);
        }
        return Math.abs(sum-2*B[half]);
    }
}
