package org.bing.learn.数据结构.排序.冒泡排序;
/*
    冒泡排序--两两互换
    相邻2个数比较，大者交换后移，一趟下来每次会把1个最大的放到最后面（只比较未排序）
    重复操作只需n-1躺
 */
public class BubbleSort {

    public static void main(String[]args){
        int[] arr={6,9,8,7,1,5,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
}
