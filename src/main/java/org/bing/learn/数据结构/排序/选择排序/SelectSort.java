package org.bing.learn.数据结构.排序.选择排序;

/*
    选择排序--选最小
    每次选最小。一趟下来选出最小的放到最前面
 */
public class SelectSort {
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
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    int tmp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tmp;
                }
            }
        }
    }
}
