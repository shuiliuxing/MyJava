package org.bing.learn.nowcode.二分查找.数字在升序数组中出现的次数NC74;

import org.bing.work.基本工具.Tools;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1,2,4,6,8,10};
        int k=4;
        System.out.println(GetNumberOfK(array,k));
    }

    public static int GetNumberOfK(int [] array , int k) {
        int num=0;
        int i=0;
        int j=array.length-1;
        while (i<=j){
            int mid=(i+j)/2;
            if(k==array[mid]){
                num++;
                for(int t=1;mid-t>=0 || mid+t<=array.length-1;t++){
                    if(mid-t>=0 && array[mid-t]==k){
                        num++;
                    }
                    if(mid+t<=array.length-1 && array[mid+t]==k){
                        num++;
                    }
                }
                break;
            }else if(k<array[mid]){
                j=mid-1;
            }else {
                i=mid+1;
            }
        }
        return num;
    }
}
