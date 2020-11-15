package org.bing.learn.nowcode.字符串.最长回文串NC17;

public class Solution {
    public static void main(String[] args){
        String A="abc1234321ab";
        int n=12;
        System.out.println(getLongestPalindrome(A, 12));
    }

    public static int getLongestPalindrome(String A, int n) {
        int max=1;
        for(int i=0;i<n;i++){
            int num=1;
            for(int j=1;i-j>=0 && i+j<n;j++){
                if(A.charAt(i-j)==A.charAt(i+j)){
                    num+=2;
                }else {
                    break;
                }
            }
            if(max<num){
                max=num;
            }
            num=0;
            for(int j=0;i-j>=0 && i+j+1<n;j++){
                if(A.charAt(i-j)==A.charAt(i+j+1)){
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
