package org.bing.learn.算法.数组.只出现一次的数字;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Solution {
    public static void main(String[] args){
        int[] nums={2,2,3,4,4,3,5};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],0);
                continue;
            }
            map.put(nums[i],1);
        }
        for(Integer tmp:map.keySet()){
            if(map.get(tmp)==1) {
                return tmp;
            }
        }
        return -1;
    }
}
