package org.bing.learn.算法.数组.两个数组的交集2;

import java.util.*;

public class Solution {
    public static void main(String[] args){
        int[] nums1={1,2,2,1};
        int[] nums2={2,2};
        System.out.println(intersect(nums1,nums2));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int L1=nums1.length;
        int L2=nums2.length;
        List<Integer> list=new ArrayList<>();
        int m=0;
        for(int i=0;i<L1;i++){
            for(int j=m;j<L2;j++){
                if(nums1[i]==nums2[j]){
                    list.add(nums1[i]);
                    m=j+1;
                    break;
                }
            }
        }
        int[] arr=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}
