package org.bing.learn.nowcode.数组.寻找峰值NC107;


public class Solution {
    public static void main(String[] args){
        int[] a={3,2};
        System.out.println(solve(a));
    }

    public static int solve (int[] a) {
        int n=a.length;
        int i;
        for(i=n-1;i-1>=0;i--){
            if(a[i]>a[i-1]){
                return i;
            }
        }
        return i;
    }
}
