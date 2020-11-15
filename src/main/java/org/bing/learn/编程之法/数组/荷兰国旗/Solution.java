package org.bing.learn.编程之法.数组.荷兰国旗;

import org.bing.work.基本工具.Tools;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {2,0,1,0,0,2,1,1,2};
        oddEvenSort1(arr);
        Tools.print(arr);
    }

    public static int[] oddEvenSort(int[] arr) {
        int[] a=new int[100];
        int[] b=new int[100];
        int[] c=new int[100];
        int[] res=new int[arr.length];
        int x=0,y=0,z=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==0){
                a[x++]=arr[i];
            }
            if(arr[i]==1){
                b[y++]=arr[i];
            }
            if(arr[i]==2){
                c[z++]=arr[i];
            }
        }
        int m=0;
        for(int i=0;i<x;i++){
            res[m++]=a[i];
        }
        for(int i=0;i<y;i++){
            res[m++]=b[i];
        }
        for(int i=0;i<z;i++){
            res[m++]=c[i];
        }
        return res;
    }

    public static void oddEvenSort1(int[] arr) {
        int i=0,k=0;
        int j=arr.length-1;
        while (k<=j){
            if(arr[k]==0){
                swap(arr,i,k);
                k++;
                i++;
            }else if(arr[k]==1){
                k++;
            }else if(arr[k]==2){
                swap(arr,k,j);
                j--;
            }
        }
    }

    public static void swap(int[] arr,int a,int b){
        int tmp=arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }


}
