package org.bing.learn.nowcode.分治.寻找第K大NC88;

import org.bing.work.基本工具.Tools;

public class Solution {
    public static void main(String[] args){
        int[] a={1,3,5,2,6};
        int n=a.length;
        int K=2;
        System.out.println(findKth(a, n,K));
    }

    public static int findKth(int[] a, int n, int K) {
        int left=0;
        int right=n-1;
        sort(a,left,right);
        return a[n-K];
    }

    public static void sort(int[] a, int left, int right){
        if(left>=right){
            return;
        }
        int i=left;
        int j=right;
        int mark=a[left];
        while (i<j){
            while(i<j && a[j]>mark){
                j--;
            }
            while (i<j && a[i]<=mark){
                i++;
            }
            if(i<j){
                swap(a,i,j);
            }
        }
        a[left]=a[i];
        a[i]=mark;
        sort(a,left,i-1);
        sort(a,i+1,right);
    }

    public static void swap(int[] a, int i, int j){
        int tmp=a[i];
        a[i]=a[j];
        a[j]=tmp;
    }
}
