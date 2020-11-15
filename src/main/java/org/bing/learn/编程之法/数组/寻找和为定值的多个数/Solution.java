package org.bing.learn.编程之法.数组.寻找和为定值的多个数;

import org.bing.work.基本工具.Tools;

public class Solution {
    public static int[] res=new int[20];

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,9,30,11};
        int k=5;
        int sum=23;
        sumOfNum(arr,0,arr.length-1,k,sum);
        for(int i=0;i<k;i++){
            System.out.print(res[i]+"\t");
        }
    }

    //利用全排列，再取前k个数
    public static void sumOfNum(int[] arr,int from,int to,int k,int sum) {
        if(from==to){
            int tmp=0;
            for(int i=0;i<k;i++){
                tmp+=arr[i];
            }
            if(tmp==sum){
                for(int i=0;i<k;i++){
                    res[i]=arr[i];
                }
            }
        }else{
            for(int i=from;i<=to;i++){
                swap(arr,from,i);
                sumOfNum(arr,from+1,to,k,sum);
                swap(arr,i,from);
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
