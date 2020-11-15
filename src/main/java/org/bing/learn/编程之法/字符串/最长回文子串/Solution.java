package org.bing.learn.编程之法.字符串.最长回文子串;

public class Solution {
    public static void main(String[] args){
        String str="adda";
        System.out.println(longestPalindrome(str));
    }


    //暴力求解
    public static int longestPalindrome(String str){
        int n=str.length();
        int max=0;
        for(int i=0;i<n;i++){
            int num=1;
            //如果长度是奇数
            for(int k=1;i-k>=0 && i+k<=n-1;k++){
                if(str.charAt(i-k) == str.charAt(i+k)){
                    num+=2;
                }else {
                    break;
                }
            }
            if(max<num){
                max=num;
            }
            //如果长度是偶数
            num=0;
            for(int k=0;i-k>=0 && i+k+1<=n-1;k++){
                if(str.charAt(i-k) == str.charAt(i+k+1)){
                    num+=2;
                }else {
                    break;
                }
            }
            if(max<num){
                max=num;
            }
        }
        return max;
    }
}
