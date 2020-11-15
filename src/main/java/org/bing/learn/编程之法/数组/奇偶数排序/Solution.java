package org.bing.learn.编程之法.数组.奇偶数排序;

import org.bing.work.基本工具.Tools;

public class Solution {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        fibonacci(arr);
        Tools.print(arr);

    }

    //每次跳1级、2级
    public static void fibonacci(int[] arr) {
        int len=arr.length;
        int[] s=new int [len];
        int[] t=new int[len];
        int m=0;
        int n=0;
        for (int i=0;i<len;i++){
            if(arr[i]%2!=0){
                s[m++]=arr[i];
            }else{
                t[n++]=arr[i];
            }
        }
        for(int i=0;i<m;i++){
            arr[i]=s[i];
        }
        for(int i=0;i<n;i++){
            arr[m++]=t[i];
        }
    }
}
