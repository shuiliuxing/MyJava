package org.bing.learn.nowcode.二分查找.在两个长度相等的排序数组中找到中位数NC36;

import org.bing.work.基本工具.Tools;

public class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] brr1={3,4,5,6};
        System.out.println(findMedianinTwoSortedAray(arr1, brr1));
    }

    public static int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {
        int n=arr1.length;
        int i=0;
        int j=0;
        while(i<n || j<n){
            if((i<n && j<n && arr1[i]<arr2[j]) || j>=n){
                if(i+j==n-1){
                    return arr1[i];
                }
                i++;
            }else if((i<n && j<n && arr1[i]>=arr2[j]) || i>=n){
                if(i+j==n-1){
                    return arr2[j];
                }
                j++;
            }
        }
        return 0;
    }
}
