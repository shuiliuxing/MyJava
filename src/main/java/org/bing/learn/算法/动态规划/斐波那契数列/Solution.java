package org.bing.learn.算法.动态规划.斐波那契数列;

public class Solution {
    static int[] arr=new int[11];

    public static void main(String[] args){
        System.out.println(fab2(6));
    }

    public static int fab1(int n){
        if(n==1 || n==2){
            return 1;
        }else{
            return fab1(n-1)+fab1(n-2);
        }
    }

    public static int fab2(int n){
        if(arr[n]!=0){
            return arr[n];
        }
        if(n==1 || n==2){
            return 1;
        }else{
            int v= fab2(n-1)+fab2(n-2);
            arr[n]=v;
            return v;
        }
    }
}

/*
    1 1 2 3 5 8 13 21 34
 */
