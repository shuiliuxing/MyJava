package org.bing.learn.编程之法.数组.寻找最小的k个数;

import org.bing.work.基本工具.Tools;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {2,1,5,3,6,4,8,9,7};
        int k=4;
        Tools.print(ksmall(arr,k));
    }

    //简单排序
    public static int[] ksmall(int[] arr,int k) {
        Arrays.sort(arr);
        int[] res=new int[k];
        for(int i=0;i<k;i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
