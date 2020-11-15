package org.bing.learn.算法.数组.移动零;

public class Solution {
    public static void main(String[] args){
        int[] nums={0,1,0,3,12};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+"\t");
        }
    }

    public static void moveZeroes(int[] nums) {
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]!=0 && nums[j]==0){
                    nums[j]=nums[i];
                    nums[i]=0;
                    break;
                }
            }
        }
    }
}
