package org.bing.learn.编程之法.字符串.字符串的旋转;

public class Solution {
    public static void main(String[] args){
        String str="abcdef";
        int n=1;
        System.out.println(leftShiftOne(str,n));
    }

    public static String leftShiftOne(String str,int m){
        char[] ch=new char[str.length()];
        int k=0;
        for(int i=m;i<str.length();i++){
            ch[k++]=str.charAt(i);
        }
        for(int i=0;i<m;i++){
            ch[k++]=str.charAt(i);
        }
        return String.valueOf(ch);
    }
}
