package org.bing.learn.数据结构.排序.计数排序;

import org.bing.work.基本工具.Tools;

public class CountSort {
    public static void main(String[] args){
        int[] arr={2,3,0,5,4,8,1,4};
        int[] newArr=sort(arr);
        Tools.print(newArr);
    }

    public static int[] sort(int[] arr){
        //确定最大、最小值
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        //确定中间数组的长度，如上：8-0+1=9
        int[] s=new int[max-min+1];
        //遍历原数组，统计每个元素-最小值，然后出现的频数
        for(int i=0;i<arr.length;i++){
            s[arr[i]-min]+=1;
        }

        //结果数组
        int[] t=new int[arr.length];
        int index=0;
        for(int i=0;i<s.length;i++){
            for(int j=0;j<s[i];j++){
                t[index]=i+min;
                index++;
            }
        }
        return t;
    }
}
