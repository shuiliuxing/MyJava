package org.bing.learn.编程之法.字符串.字符串的全排列;

public class Solution {
    public static void main(String[] args){
        String str="123";
        char[] arr=str.toCharArray();
        callAllPermutation(arr,0,arr.length-1);
    }

    public static void callAllPermutation(char[] arr, int from, int to){
        if(from==to){
            for(int i=0;i<=to;i++){
                System.out.print(arr[i]);
            }
            System.out.println();
        }
        else{
            //把当前字符轮流放在其它位置
            for(int j=from;j<=to;j++){
                swap(arr,j,from);
                callAllPermutation(arr,from+1,to);
                swap(arr,j,from);
            }
        }

    }

    public static void swap(char[] arr, int i, int j){
        char tmp=arr[i];
        arr[i]=arr[j];
        arr[j]=tmp;
    }

}
