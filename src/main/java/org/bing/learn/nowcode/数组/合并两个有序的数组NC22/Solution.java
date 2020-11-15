package org.bing.learn.nowcode.数组.合并两个有序的数组NC22;

import org.bing.work.基本工具.Tools;

public class Solution {

    public static void main(String[] args){
        int[] A={2,0,0,0,0};
        int m=1;
        int[] B={1};
        int n=1;
        merge(A,m,B,n);
        Tools.print(A);
    }

    public static void merge(int A[], int m, int B[], int n) {
        //特殊情况处理
        if(m==0){
            for(int i=0;i<n;i++){
                A[i]=B[i];
            }
            return;
        }
        if(n==0){
            return;
        }
        int[] C=new int[m];
        for(int i=0;i<m;i++){
            C[i]=A[i];
        }
        int i=0,j=0;
        int k=0;
        while (i+j<(m+n)){
            if((i<m && j<n && C[i]<=B[j]) || (j>=n && i<m)){
                A[k++]=C[i];
                i++;
            }
            if((j<n && i<m && C[i]>B[j]) || (i>=m && j<n)){
                A[k++]=B[j];
                j++;
            }
        }
    }
}
