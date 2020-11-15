package org.bing.learn.leetcode;

public class 两数之和 {

    public static int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    arr[0]=i;
                    arr[1]=j;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args){
        int[] nums={2, 7, 11, 15};
        int target=9;
        int[] arr=twoSum(nums,target);
        System.out.println("["+arr[0]+","+arr[1]+"]");
    }
}
