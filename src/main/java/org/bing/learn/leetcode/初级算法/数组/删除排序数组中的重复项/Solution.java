package org.bing.learn.leetcode.初级算法.数组.删除排序数组中的重复项;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args){
       int[] nums = {-3,-1,0,0,0,3,3};
       int len=removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {
        Set<Integer> set=new LinkedHashSet<>();
        for(int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int k=0;
        for(Integer tmp:set){
            nums[k]=tmp;
            k++;
        }
        return set.size();
    }
}
