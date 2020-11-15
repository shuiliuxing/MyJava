package org.bing.learn.nowcode.二分查找.寻找峰值NC107;

import com.sun.org.apache.regexp.internal.RE;

public class Solution {
    public static void main(String[] args){
        int[] a=new int[]{7,6,5,4,3,2};
        //System.out.println(solve(a));
        System.out.println(solve2(a));
    }


    //元素最大
    public static int solve (int[] a) {
        int max=-2147483648;
        int index=0;
        int len=a.length;
        for(int i=0;i<len;i++){
            //取0时
            if(i==0){
                if(len>=2 && a[0]>a[1] && max<a[0]) {
                    max = a[0];
                    index=0;
                }
            }
            //取末尾
            else if(i==len-1){
                if(len>=2 && a[len-1]>=a[len-2] && max<a[len-1]){
                    max=a[len-1];
                    index=len-1;
                }
            }
            //取中间
            else if(a[i]>a[i-1] && a[i]>=a[i+1] && max<a[i]){
                max=a[i];
                index=i;
            }
        }
        return index;
    }

    //索引最大
    public static int solve1 (int[] a) {
        // write code here
        int i = a.length-1;
        while (i>=1 && a[i]<a[i-1]){
            i--;}
        return i;
    }

    //自己
    public static int solve2 (int[] a){
        int index=a.length-1;
        for(int i=a.length-1;i>=1;i--){
            if(a[i]<a[i-1]){
                index=i-1;
            }else{
                break;
            }
        }
        return index;
    }
}
