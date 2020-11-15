package org.bing.learn.数据结构.排序.快速排序;

import java.util.Stack;

/*
    快速排序--分治法
 */
public class QuickSort {
    public static void main(String[] args){
        int[] arr={2,6,1,3,9,34,27,18,0,97};
        //sort(arr,0,arr.length-1);     //递归
        QSort(arr,0,arr.length-1);      //非递归
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    //递归实现
    public static void sort(int[] arr, int low, int high){
        if(low>=high){
            return;
        }
        int i=low;
        int j=high;
        int base=arr[low];
        //循环结束i==j
        while (i<j){
            //找出比基准小的元素
            while (i<j && arr[j]>=base){
                j--;
            }
            //找出比基准大的元素
            while (i<j && arr[i]<=base){
                i++;
            }
            //两个元素位置互换
            if(i<j){
                int tmp=arr[i];
                arr[i]=arr[j];
                arr[j]=tmp;
            }
        }
        //low位置与i位置元素互换（此时i/j位置元素比base小）
        arr[low]=arr[i];
        arr[i]=base;
        //递归
        sort(arr,low,j-1);
        sort(arr,j+1,high);
    }

    //非递归
    public static int partition(int[] arr, int low, int high){
        //三数取中，中间元素放第1位
        if(arr[low]>arr[high]){
            swap(arr,low,high);
        }
        if(arr[(low+high)/2]>arr[high]){
            swap(arr,(low+high)/2,high);
        }
        if(arr[low]<arr[(low+high)/2]){
            swap(arr,low,(low+high)/2);
        }
        //第1个为基准元素
        int base=arr[low];
        while (low<high){
            while (low<high && arr[high]>=base){
                high--;
            }
            arr[low]=arr[high];
            while (low<high && arr[low]<=base){
                low++;
            }
            arr[high]=arr[low];
        }
        arr[low]=base;
        return low;
    }

    public static void QSort(int[] arr, int low, int high){
        int mid;
        if(low>=high){
            return;
        }
        Stack<Integer> stack=new Stack<>();
        stack.push(low);
        stack.push(high);
        while (!stack.empty()){
            high=stack.pop();
            low=stack.pop();
            mid=partition(arr,low,high);
            //先压low,再压high
            if(low < mid-1){
                stack.push(low);
                stack.push(mid-1);
            }
            if(mid+1 < high){
                stack.push(mid+1);
                stack.push(high);
            }
        }
    }

    //交换元素
    public static void swap(int[] arr, int i, int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
























