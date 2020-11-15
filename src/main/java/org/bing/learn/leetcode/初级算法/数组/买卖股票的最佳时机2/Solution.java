package org.bing.learn.leetcode.初级算法.数组.买卖股票的最佳时机2;

import java.util.Set;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args){
        int[] prices={7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices){
        Set<Integer> set=new TreeSet<>();
        for(int i=0; i<prices.length-1; i++){
            for (int j=i+1; j<prices.length; j++){
                if(prices[i]<prices[j]){
                    set.add(prices[j]-prices[i]);
                }
            }
        }
        for(Integer tmp:set){
            System.out.println(tmp);
        }
        return set.iterator().next();
    }
}
