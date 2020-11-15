package org.bing.learn.算法.数组.存在重复元素;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args){
        int[] nums={1,1,2,3,4};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }
}
