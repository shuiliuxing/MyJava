package org.bing.learn.算法.动态规划.打家劫舍;

/*
你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。

示例 1：
输入：[1,2,3,1]
输出：4
解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
     偷窃到的最高金额 = 1 + 3 = 4 。

示例 2：
输入：[2,7,9,3,1]
输出：12
解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
     偷窃到的最高金额 = 2 + 9 + 1 = 12 。
 */
public class Solution {
    public static void main(String[] args){
        int[] arr={2,1,1,2};
        System.out.println(rob(arr));
    }

    public static int rob(int[] nums){
        int[] B=new int[nums.length];
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(i==0 || i==1){
                B[i]=nums[i];
            }
            else if(i==2){
                B[i]=Math.max(nums[i], B[i-2]+nums[i]);
            }
            else{
                int r1=Math.max(nums[i], B[i-2]+nums[i]);
                int r2=Math.max(nums[i], B[i-3]+nums[i]);
                B[i]=Math.max(r1,r2);
            }
            max=Math.max(B[i], max);
        }
        return max;
    }
}
