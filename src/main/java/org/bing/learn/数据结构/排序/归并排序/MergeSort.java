package org.bing.learn.数据结构.排序.归并排序;
/*
    归并排序--分治法
    将待排元素序列分成2个长度相等的子序列，为每个子序列排好序，然后再将它们合并
    合并2个子序列的过程就是两路归并
    复杂度：nlog2n（最好、最坏、平均）
 */
public class MergeSort {
    public static void main(String[] args){
        int[] arr={2,6,1,3,9,34,27,18,0,97};
        mergeSort(arr,0,arr.length-1);      //非递归
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    //合并
    public static void merge(int[] arr, int low, int mid, int high){
        int[] tmp=new int[arr.length];  //辅助数组
        int p1=low; //检测指针
        int p2=mid+1;   //检测指针
        int k=low;  //存放指针
        while (p1<=mid && p2<=high){
            if(arr[p1]<=arr[p2]){
                tmp[k++]=arr[p1++];
            }else{
                tmp[k++]=arr[p2++];
            }
        }
        while (p1<=mid){
            tmp[k++]=arr[p1++];
        }
        while (p2<=high){
            tmp[k++]=arr[p2++];
        }
        //拷贝数据
        for(int i=low;i<=high;i++){
            arr[i]=tmp[i];
        }
    }

    //递归划分
    public static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(arr,low,mid);         //左侧子序列递归排序
            mergeSort(arr,mid+1,high);  //右侧子序列递归排序
            merge(arr,low,mid,high);        //合并
        }
    }
}
