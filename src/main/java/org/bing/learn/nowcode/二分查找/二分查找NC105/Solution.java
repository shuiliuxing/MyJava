package org.bing.learn.nowcode.二分查找.二分查找NC105;

public class Solution {
    public static void main(String[] args){
        int n=5;
        int v=3;
        int[] arr={3,3,3,3,3};
        System.out.println(upper_bound_(n,v,arr));
    }

    public static int upper_bound_ (int n, int v, int[] a) {
        int left=0;
        int high=n-1;
        while (left<high){
            int mid=(left+high)/2;
            if(v<a[mid] || (v==a[mid] && (mid-1)>=0 && a[mid-1]==a[mid])){
                high=mid-1;
            }else if(v>a[mid]){
                left=mid+1;
            }else {
                return mid+1;
            }
        }
        //找不到
        if(high==n-1){
            return a.length+1;
        }
        return left+1;
    }
}
