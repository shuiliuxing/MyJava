package org.bing.learn.编程之法.字符串.回文判断;

public class Solution {
    public static void main(String[] args){
        String str="mmdmm";
        System.out.println(isPalindrome(str));
    }


    //暴力轮询
    public static boolean isPalindrome(String str){
        int n=str.length();
        int i;
        for(i=0;i<n/2;i++){
            if(str.charAt(i)!=str.charAt(n-1-i)){
                System.out.println(i+"\t"+(n-1-i));
                break;
            }
        }
        if(i==n/2){
            return true;
        }
        return false;
    }
}
