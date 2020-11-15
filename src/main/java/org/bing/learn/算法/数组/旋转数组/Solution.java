package org.bing.learn.算法.数组.旋转数组;

public class Solution {
    public static void main(String[] args){
        int[] nums={-1};
        rotate(nums,3);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
    }

    public static void rotate(int[] nums,int k){
        int[] arr=new int[nums.length];
        int tmp;
        for(int i=0;i<nums.length;i++){
            tmp=i+k;
            if(tmp>=nums.length){
                tmp=(tmp-nums.length)%nums.length;
            }
            arr[tmp] = nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}
