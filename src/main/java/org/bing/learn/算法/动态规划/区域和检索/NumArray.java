package org.bing.learn.算法.动态规划.区域和检索;

public class NumArray {
    public NumArray(int[] nums) {
        sum=new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            sum[i+1]=sum[i]+nums[i];
        }
    }

    static int[] sum;
    public static void main(String[] args){
        int[] nums={-2, 0, 3, -5, 2, -1};
        NumArray numArray=new NumArray(nums);
        for(int i=0;i<sum.length;i++){
            System.out.print(sum[i]+"\t");
        }
        System.out.println(numArray.sumRange(0,2));
    }


    public  int sumRange(int i, int j) {
        return sum[j+1]-sum[i];
    }
}
