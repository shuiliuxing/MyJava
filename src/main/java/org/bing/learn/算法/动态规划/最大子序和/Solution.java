package org.bing.learn.算法.动态规划.最大子序和;
/*
    给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
    示例:
    输入: [-2,1,-3,4,-1,2,1,-5,4]
    输出: 6
    解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
 */
public class Solution {
    public static void main(String[] args){
        int[] arr={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] nums){
        int[] B=new int[nums.length];
        int max=-2147483648;
        for(int i=0;i<nums.length;i++){
            if(i==0){
                B[i]=nums[i];
            }else {
                B[i] = Math.max(nums[i], B[i - 1] + nums[i]);
            }
            max = Math.max(B[i], max);
        }
        return max;
    }
}
