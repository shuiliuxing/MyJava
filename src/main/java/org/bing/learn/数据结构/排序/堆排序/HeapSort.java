package org.bing.learn.数据结构.排序.堆排序;

public class HeapSort {
    public static void main(String[] args){
        int[] arr={2,6,1,3,9,34,27,18,0,97};
        sort(arr,arr.length);      //非递归
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    public static void sort(int[] arr,int len){
        //初始化，i从最后1个父节点开始调整
        for(int i=len/2-1;i>=0;i--){
            heap(arr,i,len-1);
        }
        for(int i=len-1;i>0;i--){
            swap(arr,0,i);
            heap(arr,0,i-1);
        }

    }

    public static void heap(int[] arr, int start, int end){
        int dad=start;
        int son=dad*2+1;
        while (son<=end){
            //比较2个子节点
            if(son+1<=end && arr[son]<arr[son+1]){
                son++;
            }
            if(arr[dad]>arr[son]){
                return;
            }
            else{
                swap(arr,dad,son);
                dad=son;
                son=dad*2+1;
            }
        }
    }

    public static void swap(int[] arr,int i,int j){
        int tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }
}
