package org.bing.learn.数据结构.排序.希尔排序;
/*
    希尔排序
 */
public class ShellSort {
    public static void main(String[] args){
        int[] arr={2,6,1,3,9,34,27,18,0,97};
        sort(arr);      //非递归
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void sort(int[] arr){
        //步长
        for(int step=arr.length/2;step>0;step/=2){
            //对1个步长区间进行比较
            for(int i=step;i<arr.length;i++){
                int base=arr[i];
                int j;
                for(j=i-step;j>=0 && arr[j]>base;j-=step){
                    arr[j+step]=arr[j];
                }
                arr[j+step]=base;
            }
        }
    }
}
