package org.bing.learn.算法.二分查找;

public class Solution {

    public static void main(String[] args){
        int n=5;
        int v=3;
        int[] arr={3,3,3,3,3};
        System.out.println(upper_bound_(n,v,arr));
    }

    public static int upper_bound_(int n, int v, int[] a) {
        int left=0;
        int high=n-1;
        while (left<high){
            int mid=(left+high)/2;
            if(v==a[mid]){
                return mid;
            }else if(v<mid){
                high=mid-1;
            }else {
                left=mid+1;
            }
        }
        return -1;
    }

}
