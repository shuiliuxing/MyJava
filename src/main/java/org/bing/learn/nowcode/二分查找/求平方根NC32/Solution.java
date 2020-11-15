package org.bing.learn.nowcode.二分查找.求平方根NC32;

public class Solution {
    public static void main(String[] args){
        System.out.println(sqrt(1518991037));
    }

    public static int sqrt(int x) {
        if(x<=0){
            return 0;
        }
        long left=1;
        long high=x;
        while (left<high){
            long mid=(left+high)/2;
            long s=mid*mid;
            long t=(mid+1)*(mid+1);
            if(s==x || (s<x && t>x)){
                return (int)mid;
            }else if(s<x) {
               left=mid+1;
            }else{
                high=mid-1;
            }
        }
        return (int)left;
    }

}
