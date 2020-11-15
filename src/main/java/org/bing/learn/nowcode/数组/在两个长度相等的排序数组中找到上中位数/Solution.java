package org.bing.learn.nowcode.数组.在两个长度相等的排序数组中找到上中位数;

public class Solution {

    public static void main(String[] args){
        int[] arr1={5};
        int[] arr2={1};
        System.out.println(findMedianinTwoSortedAray(arr1,arr2));
    }

    public static int findMedianinTwoSortedAray (int[] arr1, int[] arr2) {
        int n=arr1.length;
        int i=0,j=0;
        while (i+j<(2*n-2)){
            if((i<n && j<n && arr1[i]<=arr2[j]) || (j>n && i<n)){
                i++;
            }
            if(i+j==(2*n-2)/2){
                System.out.println(i+"\t"+j);
                return arr1[i-1];
            }
            if((i<n && j<n && arr1[i]>arr2[j]) || (i>n && j<n)){
                j++;
            }
            if(i+j==(2*n-2)/2){
                System.out.println("\t丢"+i+"\t"+j);
                return arr1[j-1];
            }
        }
        return arr1[0];
    }
}
