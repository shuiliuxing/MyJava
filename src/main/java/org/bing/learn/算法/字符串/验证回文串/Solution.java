package org.bing.learn.算法.字符串.验证回文串;

public class Solution {
    public static void main(String[] args){
        String s="race a ecar";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while (i<j){
            char ci=s.charAt(i);
            char cj=s.charAt(j);
            //非字符
            if(!Character.isLetterOrDigit(ci)){
                i++;
            }else if(!Character.isLetterOrDigit(cj)){
                j--;
            }else if(Character.toLowerCase(ci)==Character.toLowerCase(cj)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        if(i>=j){
            return true;
        }
        return false;
    }

    //判断字符是否合法
    public static boolean isCharNum(char c){
        if((c>='A' && c<='Z')|| (c>='a' && c<='z') || (c>='0' && c<='9')){
            return true;
        }
        return false;
    }

}
