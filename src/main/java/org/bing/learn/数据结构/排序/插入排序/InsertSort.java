package org.bing.learn.数据结构.排序.插入排序;
/*
    插入排序--在它前面找位置插入
    适合前面已排好序，比较高效
 */
public class InsertSort {
    public static void main(String[] args){
        int[] arr={6,9,8,7,1,5,3};
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void sort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++){
            int tmp=arr[i];
            int j=i;
            while (j>=1 && tmp<arr[j-1]){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=tmp;
        }
    }
}
