package org.bing.learn.编程之法.数组.寻找和为定值的两个数;

import org.bing.work.基本工具.Tools;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,20,11,15};
        int sum=25;
        Tools.print(twoSum1(arr,sum));
    }

    //暴力求解
    public static int[] twoSum(int[] arr,int sum) {
        int[] res=new int[2];
        int n=arr.length;
        boolean flag=true;
        for(int i=0;i<n & flag;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==sum){
                    res[0]=arr[i];
                    res[1]=arr[j];
                    flag=false;
                    break;
                }
            }
        }
        return res;
    }

    //先排序，再对向扫描
    public static int[] twoSum1(int[] arr,int sum) {
        int[] res=new int[2];
        //排好序
        Arrays.sort(arr);
        //对向扫描
        int i=0;
        int j=arr.length-1;
        while (i<j){
            if(arr[i]+arr[j]==sum){
                res[0]=arr[i];
                res[1]=arr[j];
                break;
            }else if(arr[i]+arr[j]<sum){
                i++;
            }else {
                j--;
            }
        }
        return res;
    }
}
