package org.bing.learn.算法.数组.两数之和;

public class Solution {
    public static void main(String[] args){
        int[] nums={2, 7, 11, 15};
        int[] arr=twoSum(nums,26);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static int[] twoSum(int[] nums, int target){
        int[] arr=new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && (nums[i]+nums[j])==target){
                    arr[0]=i;
                    arr[1]=j;
                    return arr;
                }
            }
        }
        return arr;
    }

}
